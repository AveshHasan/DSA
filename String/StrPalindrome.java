package String;

// public class StrPalindrome {
//     public static void main(String[] args) {
//         String str = "NOON";
//         String rev = "";
//         for(int i = str.length()-1; i>=0; i--)
//         {
//             rev = rev+str.charAt(i);

//         }
//         for(int i =0; i<str.length(); i++)
//         {
//             char ch1 = str.charAt(i);
//             char ch2 = rev.charAt(i);
//             if(ch1==ch2)
//             {
//                 System.out.println("String is Palindrome");
//                 break;
//             }
//             else
//             {
//                 System.out.println("String is Not Palindrome");
//                 break;
//             }
//         }
//     }
// }
public class StrPalindrome
{
    public static void main(String[] args) {
        String str = "MADAm";
        String rev = "";
        str = str.toUpperCase();
        for(int i =str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        for(int i = 0; i < str.length(); i++)
        {
            char right = str.charAt(i);
            char left = rev.charAt(i);
            if(right == left)
            {
                System.out.println("Given String is Palindrome");
                break;
            }
            else{
                System.out.println("Given String is not a Palindrome");
                break;
            }
        }
    }
}
