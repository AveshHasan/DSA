package String;

public class LengthCountStr {
    public static void main(String[] args) {
        //Print Each Character of String and count the length without length() function
        String nam = "Avesh";
        int count =0;
        for(int i = 0; i<nam.length(); i++)
        {
             char sn = nam.charAt(i);
             System.out.print(sn+" ");
             count++;

        }
        System.out.println();
        System.out.println("Length of String is: "+count);
    }
}
