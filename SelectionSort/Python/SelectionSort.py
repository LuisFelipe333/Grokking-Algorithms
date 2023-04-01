def findSmallest(arr):
    smallest = arr[0] 
    smallest_index = 0 
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def selectionSort(arr): 
    newArr = []
    for i in range(len(arr)):
        smallest = findSmallest(arr)
        newArr.append(arr.pop(smallest))
    return newArr   

arr = [1,23,4,5,34,756,1212,43,12,53]
print(selectionSort(arr))

