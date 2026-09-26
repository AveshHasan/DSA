public class HollowDiamond {
    public static void main(String[] args)
    {
        int n=8;
        for(int i = 1; i<=n; i++)
        {
            //Upper half Spaces
            for(int j =1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("*");
                for(int j = 1; j<=2*i-3;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half
        for(int i =1; i<=n; i++)
        {
            if(i==1)
            {
                continue;
            }
            for(int j =1; j<=i-1;j++)
            {
                System.out.print(" ");
            }
            if(i==n)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("*");
                for(int j =1; j<=2*n-2*i-1; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
