package String;

public class CountVowel {
    public static void main(String[] args)
    {
        //Count Number of vowels
        String vow = "Alphabet";
        int cnt = 0;
        for(int i =0; i< vow.length(); i++)
        {
            char ch1 = vow.charAt(i);
            if(ch1 == 'a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
            {
                cnt++;
                System.out.print(ch1+" ");
            }
        }
        System.out.println();
        System.out.println("Number of Vowels are : "+cnt);
    }
}
