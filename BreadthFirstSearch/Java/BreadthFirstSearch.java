package BreadthFirstSearch.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        
        HashMap<String, String[]> hashtable = new HashMap<String, String[]>();
        hashtable.put("you", new String[]{"alice", "bob", "claire"});
        hashtable.put("bob" , new String[]{"anuj", "peggy"});
        hashtable.put("alice" , new String[]{"peggy"});
        hashtable.put("claire" , new String[]{"thom", "jonny"});
        hashtable.put("anuj" , new String[]{});
        hashtable.put("peggy" , new String[]{});
        hashtable.put("thom" , new String[]{});
        hashtable.put("jonny" , new String[]{});

        breadthFirstSearch(hashtable, "you", "thom");

    }   

    public static boolean breadthFirstSearch(HashMap<String, String[]> hashtable, String firstPerson, String personToMeet ){
        Queue<String[]> search_queue = new LinkedList<String[]>();
        search_queue.add(hashtable.get(firstPerson));
        List<String[]> searched = new ArrayList<String[]>();
        System.out.println("peek"+search_queue.peek());
        while(!search_queue.isEmpty()){
            var person = search_queue.poll();
            System.out.println(""+person);
            if(!searched.contains(person)){
                if(person.equals(personToMeet)){
                    System.out.println(firstPerson + " can meet " + personToMeet);
                    return true;
                }else{
                    search_queue.add(hashtable.get(person));
                    searched.add(person);
                }
            }
        }
        System.out.println(firstPerson + " can't meet " + personToMeet);
        return false;
    } 

}
