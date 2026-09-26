package ESDLabT2;
import java.util.*;
public class InitSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,3,2,5,8,6};
        System.out.println("Enter Starting index: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Ending index: ");
        int n2 = sc.nextInt();
        int sum =0;
        for(int i=n1; i<=n2; i++)
        {
                sum+= arr[i];
        }
        System.out.println("Sum of given range is: "+sum);
    }
    
}
