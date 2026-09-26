package BinarySearch;
public class CeilingBin {
    public static int binary(int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return arr[start];

    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,15,20,23};
        int target = 14;
        System.out.println(binary(arr, target));

    }
    
}
