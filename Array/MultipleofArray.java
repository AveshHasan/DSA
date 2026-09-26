package Array;
import java.util.*;
public class MultipleofArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter Value of Array index: "+i);
            arr[i] = sc.nextInt();
        }
        int mul = 1;
        for(int i =0; i<n; i++)
        {
            mul *= arr[i];
        }
        System.out.println("Multiple of all Array Element is: "+mul);
    }
    
}

