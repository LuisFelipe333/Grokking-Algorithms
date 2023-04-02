from collections import deque

graph = {}
graph['you'] = ['alice', 'bob', 'claire']
graph['bob'] = ['anuj', 'peggy']
graph['alice'] = ['peggy']
graph['claire'] = ['thom', 'jonny']
graph['anuj'] = []
graph['peggy'] = []
graph['thom'] = []
graph['jonny'] = []

def search(firstPerson, personToMeet):
    search_queue = deque()
    search_queue += graph[firstPerson]
    searched = []
    while search_queue:
        person = search_queue.popleft()
        if not person in searched:
            if person == personToMeet:
                print (firstPerson + " can meet " + personToMeet)
                return True
            else:
                search_queue += graph[person]
                searched.append(person)
    print (firstPerson + " can't meet " + personToMeet)

search('you', 'thom')
search('alice', 'thom')