package Array;
import java.util.*;
public class Sum2DArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of row: ");
        int r = sc.nextInt();
        int arr[][] = new int[r][];
        System.out.println("Enter Matrix elment:");
        for(int i =0; i<r; i++)
        {
            System.out.println("Enter Size of Column");
            int c = sc.nextInt();
            arr[i] = new int[c];
            for(int j = 0; j<c; j++)
            {
                System.out.println("Enter Nummber for row="+i+"and Column=:"+j);
                arr[i][j] = sc.nextInt();
            }

        }
        int sum=0;
        System.out.println("OutPut 2D Array: ");
        for(int i=0; i<r; i++)
        {
            int cl = arr[i].length;
            for(int j=0; j<cl; j++)
            {
                sum += arr[i][j];
            }
        }
        System.out.print("Sum of 2D Array is : "+sum);
    }
}


