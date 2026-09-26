package HashMap;

import java.util.HashMap;

public class TwoSum2 {
    public static void twoSum(int arr[], int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i <arr.length; i++)
        {
            int complement = target-arr[i];
            if(map.containsValue(complement))
            {
                System.out.println(complement+" + "+arr[i]+" = "+target);
                System.out.println(map.get(complement)+", "+i);
            }
            map.put(arr[i],i);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,9,6,7,4,3};
        int target = 8;
        twoSum(arr,target);
    }
}
