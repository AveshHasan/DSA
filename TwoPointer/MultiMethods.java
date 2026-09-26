package TwoPointer;

public class MultiMethods {
    public static void subArray(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i; j<arr.length; j++)
            {
                for(int s=i; s<=j;s++)
                {
                    System.out.print(arr[s]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void sumSubArray(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i; j<arr.length; j++)
            {
                int sum=0;
                for(int s=i; s<=j;s++)
                {
                    System.out.print(arr[s]+" ");
                    sum = sum +arr[s];
                }
                System.out.println("= "+sum);
                
            }
        }
    }
    public static int maxSubArraySUM(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i; j<arr.length; j++)
            {
                int sum=0;
                for(int s=i; s<=j;s++)
                {
                    //System.out.print(arr[s]+" ");
                    sum = sum +arr[s];
                }
                if(max<sum)
                {
                    max=sum;
                }                
            }
        }
        return max;
    }
    public static void maxSubArray(int arr[])
    {
        int max=0;
        int start=0, end =0;
        for(int i = 0; i<arr.length; i++)
        {
            int sum=0;
            for(int j = i; j<arr.length; j++)
            {
                sum = sum + arr[j] ;    
                if(max<sum)
                    {
                        max=sum;
                        start=i;
                        end=j;
                    }           
            }
        }
        System.out.println("Max sum SubArray: ");
        for(int i=start; i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void returnTargetSumSubArray(int arr[])
    {
        int target=12;
        int start=0, end =0;
        for(int i = 0; i<arr.length; i++)
        {
            int sum=0;
            for(int j = i; j<arr.length; j++)
            {
                sum = sum + arr[j] ;    
                if(target==sum)
                    {
                        start=i;
                        end=j;
                    }           
            }
        }
        System.out.println("Target sum SubArray: ");
        for(int i=start; i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int jumpArray(int arr[],int target)
    {
        int count =0;
        int index = 0;
        while(index+target<arr.length)
        {
            index += target;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,4};
        subArray(arr);
        sumSubArray(arr);
        System.out.println("Maximum subArray Sum is :"+maxSubArraySUM(arr));
        maxSubArray(arr);
        returnTargetSumSubArray(arr);
        int result = jumpArray(arr,1);
        System.out.println("Number of Hops are "+result);

    }
}
