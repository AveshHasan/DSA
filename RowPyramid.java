public class RowPyramid {
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
            //Part 2 Left Half
            for(int j =1; j<=2*i-1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
