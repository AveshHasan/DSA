package SlidingWindow;

public class MaxSumArray {
    public static int maxSum(int arr[])
    {
        int sum =arr[0];
        int maxsum = arr[0];
        for(int i=1; i<arr.length;i++)
        {
            sum = Math.max(sum+arr[i], arr[i]);
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,-3,7,1,-1,8};
        int sum = maxSum(arr);
        System.out.println(sum);
    }
}
