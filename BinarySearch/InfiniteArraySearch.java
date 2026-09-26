package BinarySearch;

public class InfiniteArraySearch {
    public static int searchInfinit(int[] arr, int target)
    {
        int start = 0;
        int end = 1;
        while(target>arr[end])
        {
            int temp = end +1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

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
        int arr[] = {2,5,6,7,9,12,17,19,22,23,25,29,31,39,41};
        int target = 23;
        System.out.println(searchInfinit(arr, target));
        
    }
}
