package SlidingWindow;

public class SubArraySumTarget {
    public static void subArray(int arr[],int key,int sum)
    {
        for(int i =0; i<arr.length-key;i++)
        {
            int s =0;
            for(int j =i; j<i+key;j++)
            {
                s = s +arr[j];
            }
            if(s==sum)
            {
                System.out.println("SubArray is ");
                for(int j =i; j<i+key;j++)
                {
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        subArray(arr,3,9);
        
    }
}
