package Sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,8,2,1};
        //int [] arr = {1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int arr[])
    {
        //using to confirm that if array is sorted it must break instead of running again and again
        boolean swapped;
        for(int i = 0; i<arr.length; i++)
        {
            swapped = false;
            for(int j =1; j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            //if swap not occurs break the loop
            if(!swapped)
            {
                break;
            }
        }
    }
    
}
