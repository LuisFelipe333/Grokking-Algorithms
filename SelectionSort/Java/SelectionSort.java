package SelectionSort.Java;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(11,232,33,41,55,436,7,81,96,101));
        ArrayList<Integer> newArr = selectionSort(arr);
        System.out.println(newArr);
    }

    public static int findSmallest(ArrayList<Integer> arr) {
        int smallest = arr.get(0);
        int smallest_index = 0;

        for(int i=0; i<arr.size();i++){
            if(arr.get(i)<smallest)
            {
                smallest =arr.get(i);
                smallest_index = i;
            }            
        }

        return smallest_index;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        int smallest;
        int arrSize = arr.size();
        for(int i=0;i<arrSize;i++){
            smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }
        return newArr;
    }



}
