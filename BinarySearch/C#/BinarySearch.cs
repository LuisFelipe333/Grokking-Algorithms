using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_
{
    public class BinarySearch
    {
        

        public static void Main(string[] args)
        {
            List<dynamic> list = new List<dynamic>() { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int varToFind = 12;
            int finded = binarySearch(list, varToFind);
            Console.WriteLine(finded);
        }
        
        public static dynamic binarySearch(List<dynamic> list, dynamic item)
        {
            int low = 0;
            int high = list.Count - 1;
            int mid;
            dynamic guess;

            while (low <= high)
            {
                mid = low + high;
                guess = list[mid];
                if (guess == item)
                    return mid;
                if (guess > item)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            return -1;

        }

    }
}
