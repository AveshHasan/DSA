package SlidingWindow;

public class BruteSlide {
    public static void slide(int arr[],int k)
    {
        int max = Integer.MIN_VALUE;

        for(int i =0; i<=arr.length-k; i++)
        {
            int sum =0;
            for(int j =i; j<i+k;j++)
            {
                sum = sum + arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println("Maximum of sub Array is "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,7,3,9,8};
        slide(arr, 3);

    }
}
