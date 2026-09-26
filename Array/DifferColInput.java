package Array;
import java.util.*;
public class DifferColInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of row: ");
        int r = sc.nextInt();
        int arr[][] = new int[r][];
        System.out.println("Enter Matrix elment:");
        for(int i =0; i<r; i++)
        {
            System.out.println("Enter Nummber of Column Element:");
            int c = sc.nextInt();
            arr[i] = new int[c];
            for(int j = 0; j<c; j++)
            {
                System.out.println("Enter The column Element:");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("OutPut 2D Array: ");
        for(int i=0; i<r; i++)
        {
            int cl = arr[i].length;
            for(int j=0; j<cl; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
