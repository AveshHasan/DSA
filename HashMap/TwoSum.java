package HashMap;
import java.util.*;
public class TwoSum {
    public static int[] sumOf2(int arr[], int target)
    {
        //arr[] ={2,11,7,15}
        //target = 9
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++)
        {
            int num = arr[i]; //at index0=2
    
            Integer rem = target - num;//this will give remaining number 9-2=7
            
            if(map.containsKey(rem)) //this chack whether hashmap contain this remaining number or not if present then return
            {
                return new int[]{map.get(rem),i}; //first return the remaining number index then ith index
            }
            map.put(arr[i],i);//if condition failed. Here put that number in hash map along with index mapped
         }
    return new int[]{-1,-1};// if no condition full fullied


        // int sum =0;
        // for(int i =0; i<arr.length; i++)
        // {
        //     for(int j = i+1; j<arr.length; j++)
        //     {
        //         if(arr[i]+arr[j] == target)
        //         {
        //             return new int[]{i,j};
        //         }
                
        //     }
        // }
        // return new int[]{-1,-1};

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array element: ");
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        int ans[] = sumOf2(arr, target);
        
        System.out.println("Index 0: "+ans[0]);
        System.out.println("Index 1:"+ans[1]);
        System.out.println("Value 0: "+arr[ans[0]]);
        System.out.println("Value 1:"+arr[ans[1]]);

    }
}



