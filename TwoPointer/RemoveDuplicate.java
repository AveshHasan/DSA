package TwoPointer;

import java.util.HashSet;

public class RemoveDuplicate {
    public static int duplicate(int arr[])
    {
        int i =0;
        for(int j =1; j<arr.length; j++)
        {
            if(arr[j] != arr[i])
                {
                    i++;
                    arr[i]=arr[j];
                }
        }
        return i+1;
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : arr)
        // {
        //     set.add(num);
        // }
        // System.out.println(set);
        
    }
    public static void main(String[] args) {

        //int arr[] ={5,5,4,4,1,1,1,2,2,3,3}; //for unsorted array
        int arr[] ={1,1,1,2,2,3,3};
        //duplicate(arr);
        int size = duplicate(arr);
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
