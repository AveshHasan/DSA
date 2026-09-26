package SlidingWindow;

public class SlidingSum {
    public static void slide(int arr[], int k)
    {
        int windowSum = 0;
        for(int i =0; i<k; i++)
        {
            windowSum=windowSum+arr[i];
        }
        int maxSum = windowSum;
        //int window = Integer.MIN_VALUE;
        for(int i =k; i<arr.length; i++)
        {
           windowSum = windowSum-arr[i-k]+arr[i];

        }
        maxSum = Math.max(maxSum, windowSum);
        System.out.println("Maximum of Sub Array is "+ maxSum);

    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,5,7,5,6,4,10};
        int k = 3;
        slide(arr, k);

    }
}
