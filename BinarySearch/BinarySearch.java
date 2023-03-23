import java.util.Arrays;
import java.util.List;
class BinarySearch{

    public static void main(String[] args) {
    
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int numberToFind = 11;
        Integer finded = binarySearch(list, numberToFind);
        System.out.println(finded);
    
    }
    
    
    public static Integer binarySearch(List<Integer> list, int item) {
        int low = 0;
        int high = list.size()-1;
        int mid;
        int guess;
        while(low<=high)
        {
            mid = low + high;
            guess = list.get(mid);
            if(guess == item)
                return mid;
            if(guess>item)
                high = mid - 1;
            else
                low = mid + 1;
        }
    
        return null;
    }




}