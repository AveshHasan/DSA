package BinarySearch;
public class MountainArray{
    public static int search(int arr[], int target)
    {
        

    }
    public static int peakInMountainArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            //this means you are in decending part of array
            //this may be the ans but look at left
            //this id why end != mid-1;
            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            //you are in ascending part
            else{
                start = mid+1;
            }
        }
        //at the end start==end that means it is pointing to largest element
        return start;
    }
    public static int binarySearch(int arr[], int target, int start, int end)
    {
        while(start<= end)
        {
            int mid = start+(end-start)/2;
            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,8,9,7,5,3,1};
        int target = 8;

    }
}