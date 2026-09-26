package String;

public class StringBasic {
    public static void main(String[] args)
    {
        //Length and check
        String str = "    ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        //Upper And Lower and trim
        String s = "  Avesh  ";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        s=s.trim();
        System.out.println(s.length());
        //check string Availability
        String str2 = "My name is Avesh Hasan";
        System.out.println(str2.contains("Hasan"));
        System.out.println(str2.charAt(5));
        System.out.println(str2.startsWith("My "));
        System.out.println(str2.endsWith("an"));
        //SubString
        System.out.println(str2.substring(3,10));
        //Compare the String
        String s2="Avesh";
        String s3 = "AVESH";
        System.out.println(s2.equals(s3));
        //Treat every string similar it may in upper or lower case
        System.out.println(s2.equalsIgnoreCase(s3));
        
        //value of Strring and Integer are different
        int n = 12345;
        String s5 = "13256";
        System.out.println(n+5);
        System.out.println(s5+5);
        //Split Word
        String SplitStr= "I, am, Learning, DSA";
        String word[] = SplitStr.split(", ");
        for(String st : word)
        {
            System.out.println(st);
        }
        //Split a word into character

        String name = "Avesh";
        char[] ch = name.toCharArray();
        for(char cr: ch)
        {
            System.out.println("value of char is :"+cr);
        }
        //Repalce
        String nam = "hasan";
        System.out.println(nam.replace("a","i"));

        //Print Each Character of String and count the length without length() function
        int count =0;
        for(int i = 0; i<nam.length(); i++)
        {
             char sn = nam.charAt(i);
             System.out.print(sn+" ");
             count++;

        }
        System.out.println();
        System.out.println("Length of String is: "+count);


        //Count Number of vowels
        String vow = "Alphabet";
        int cnt = 0;
        for(int i =0; i< vow.length(); i++)
        {
            char ch1 = vow.charAt(i);
            if(ch1 == 'a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
            {
                cnt++;
                System.out.println(ch1+" ");
            }
        }
        System.out.println(cnt);


    }
}
