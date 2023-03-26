using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_
{
    internal class QuickSort
    {
        public static void Main(string[] args)
        {
            ArrayList arr = new ArrayList() { 1, 23, 35, 12, 125, 1234, 54, 12, 431, 9 };
            ArrayList newArr = quickSort(arr);
            foreach (var i in newArr)
            {
                Console.WriteLine(i);
            }
        }

        public static ArrayList quickSort(ArrayList arr)
        {            
            dynamic pivot;
            ArrayList less = new ArrayList();
            ArrayList greater = new ArrayList();

            if(arr.Count < 2)
            {
                return arr;
            }
            else
            {
                pivot = arr[0];
                for (int i = 1; i < arr.Count; i++)
                {
                    if ((int)arr[i] <= pivot)                    
                        less.Add(arr[i]);                    
                    else
                        greater.Add(arr[i]);                  
                }

                ArrayList newArr = quickSort(less);
                newArr.Add(pivot);
                newArr.AddRange(quickSort(greater));
                return newArr;
            }
        }

    }
}
