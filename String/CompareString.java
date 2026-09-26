package String;
import java.util.*;
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Word");
        String s1 = sc.next();
        System.out.println("Enter a word or sentence");
        String s2= sc.nextLine();
        if(s1==s2)
        {
            System.out.println("Both the String are Same(check its heap location are same)");
        }
        else
        {
            System.out.println("Both are not Equal");
        }
        if(s1.equals(s2))
        {
            System.out.println("both are equals check each charcter and case senstive");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Both are same check each character but not case sensitive like upper lower case");

        }
        else{
            System.out.println("Both are not equal");
        }
    }
}
