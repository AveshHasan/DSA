package ESDLabT2;

public class SubArray {
    public static void subArray(int arr[], int k)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k; i++)
        {
            int sum =0;
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j]+" ");
                sum += arr[j];
            }
            max = Math.max(max, sum);
            System.out.println();
        }
        System.out.println("Maximum Window sum is "+max);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,4,8};
        int k = 3;
        subArray(arr, k);

    }
}
