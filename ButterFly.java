public class ButterFly {
    public static void main(String[] args)
    {
        int n = 4;
        for(int i = 1; i<=n; i++)
        {
            //Part 1
            for(int j =1; j<=i; j++)
            {
                System.out.print("* ");
            }
            //Part 2
            for(int j = 1; j<=2*n-2*i; j++)
            {
                System.out.print("  ");
            }
            //Part 3
            for(int j =1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++)
        {
            if(i==1)
            {
                continue;
            }
            //Lower Part 4
            for(int j =1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            }
            //Part 5
            for(int j=1;j<=2*(i-1);j++)
            {
                System.out.print("  ");
            }
            //Part 6
            for(int j = 1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
