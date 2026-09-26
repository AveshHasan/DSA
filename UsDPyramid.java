public class UsDPyramid {
    public static void main(String[] args)
    {
        int n =4;
        for(int i=1; i<=n; i++)
        {
            //Upper Spaces
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j<=2*n-(2*i-1); j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower part Space
        for(int i = 1; i<=n; i++)
        {
            if(i==1)
            {
                continue;
            }
            for(int j =1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j =1; j<=2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
