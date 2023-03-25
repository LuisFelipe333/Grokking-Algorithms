package QuickSort.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(11,232,33,41,5,436,7,81,96,101));
        ArrayList<Integer> newArr = quickSort(arr);
        System.out.println(newArr);
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr){
        
        int pivot;
        ArrayList<Integer> less = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        if(arr.size()<2)
            return arr;
        else{
            pivot = arr.get(0);
            for(int i=1; i<arr.size();i++)
            {
                if(arr.get(i)<=pivot)
                {
                    less.add(arr.get(i));
                }                    
                else
                    greater.add(arr.get(i));   
            }
            ArrayList<Integer> newArr = quickSort(less);
            newArr.add(pivot);
            newArr.addAll(quickSort(greater));
            return newArr;  
        }
    }


}
