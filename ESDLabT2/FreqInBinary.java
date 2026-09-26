package ESDLabT2;

public class FreqInBinary {
    public static int outPut(int[] arr, int target)
    {
        int first = firstOccur(arr, target);
        if(first==-1)
        {
            return 0;
        }
        int last = lastOccur(arr, target);
        return last-first+1;
    }
    public static int firstOccur(int[] arr, int target)
{
    int start = 0;
    int end = arr.length - 1;
    int first = -1;

    while(start <= end)
    {
        int mid = start + (end - start) / 2;

        if(arr[mid] == target)
        {
            first = mid;
            end = mid - 1;
        }
        else if(arr[mid] < target)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    return first;
}
    public static int lastOccur(int[] arr, int target)
{
    int start = 0;
    int end = arr.length - 1;
    int last = -1;

    while(start <= end)
    {
        int mid = start + (end - start) / 2;

        if(arr[mid] == target)
        {
            last = mid;
            start = mid + 1;
        }
        else if(arr[mid] < target)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    return last;
}
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,2,2,3,5};
        int target = 2;
        System.out.println(outPut(arr, target));
    }
}
