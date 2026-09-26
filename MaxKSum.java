public class MaxKSum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int k =3;
        int size = arr.length;
        int windowsum = 0;
        for(int i =0; i<k; i++)
        {
            //This store first 3 sum
            windowsum += arr[i];
        }
        int maxSum = windowsum;
        for(int  i = k; i<size; i++)
        {
            windowsum = windowsum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowsum);
        }
        System.out.println("Max summ of k consecutive element is "+maxSum);
    }
}
