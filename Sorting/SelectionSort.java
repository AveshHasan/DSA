package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            //find max in remaining array and swap them
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMax(int[] arr, int start, int end)
    {
        // return the max element index
        int max = start;
        for(int i=start; i<=end; i++)
        {
            if(arr[max]<arr[i])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second)
    {
        //swap the max index element with last
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,8,2,1};
        //int [] arr = {1,2,3,4,5,6,7,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
