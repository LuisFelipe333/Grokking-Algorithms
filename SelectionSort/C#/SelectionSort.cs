using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_
{
    internal class SelectionSort
    {
        public static void Main(string[] args)
        {
            ArrayList arr = new ArrayList() { 1, 23, 35, 12 ,125, 1234, 54, 12, 431, 9};
            ArrayList newArr = selectionSort(arr);
            
            foreach (var i in newArr)
            {
                Console.WriteLine(i);
            }
        }

        public static int findSmallest(ArrayList arr)
        {
            var smallest = arr[0];
            int smallest_index = 0;
            for(int i = 0; i < arr.Count; i++)
            {
                if (Comparer.DefaultInvariant.Compare(arr[i],smallest)<0)
                {
                    smallest = arr[i];
                    smallest_index = i;
                }
            }

            return smallest_index;
        }

        public static ArrayList selectionSort(ArrayList arr)
        {
            ArrayList newArr = new ArrayList();
            int smallest;
            int arrSize = arr.Count;
            for(int i = 0; i<arrSize; i++)
            {
                
                smallest = findSmallest(arr);
                newArr.Add(arr[smallest]);
                arr.RemoveAt(smallest);
            }
            return newArr;
        }

    }
}
