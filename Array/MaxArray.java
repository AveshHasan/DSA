package Array;

public class MaxArray {
    public static void main(String[] args)
    {
        int arr[] = {23,12,15,-20,25};
        int n = arr.length;
        int max=arr[0];
        for(int i =0; i<n; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
