package SlidingWindow;

public class PrefixSum {
    public static int[] prefixSum(int arr[])
    {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1; i < arr.length; i++)
        {
            prefix[i] = prefix[i-1]+arr[i];
        }
        return prefix;

    }
    public static void main(String[] args) {
        int arr[] = {1,-2,-1,5,4,3};
        int result[] = prefixSum(arr);
        for(int x:result)
        {
            System.out.print(x+" ");
        }

    }
}
