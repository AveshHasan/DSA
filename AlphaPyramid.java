public class AlphaPyramid {
    public static void main(String[] args)
    {
        int n = 4;
        for(int i =1; i<=n; i++)
        {
            //Part 1 Spaces
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            //Part 2 First Half String
            for(int j = 1; j<=i; j++)
            {
                int a = j;
                int b = ('A'-1);
                int ans = a+b;
                char ansFinal = (char)ans;
                System.out.print(ansFinal+" ");
            }
            //Part 3 Right Half String
            char toPrint = (char)(i+'A'-2);
            for(int j =1; j<=i-1; j++)
            {
                System.out.print(toPrint+" ");
                toPrint--;

            }
            System.out.println();
        }
    }
}
