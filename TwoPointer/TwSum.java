package TwoPointer;
public class TwSum
{
    public static void twoSum(int arr[], int target)
    {
        int sum=0;
        for(int i =0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                sum = arr[i]+arr[j];
                if(sum==target)
                {
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,8,6,5,4};
        int target = 10;
        twoSum(arr,target);
    }
}