public class NumberPyramid {
    public static void main(String[] args)
    {
        int n=4;
        for(int i=1; i<=n; i++)
        {
            //Part 1
            for(int j =1; j<= n-i; j++)
            {
                System.out.print("  ");
            }
            //Part 2
            for(int j =1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            //Part 3
            //int rowvalue = i;
            int decrementRowValue = i - 1; 
            for(int j = 1; j<=i-1;j++)
            {
                System.out.print(decrementRowValue+" ");
                decrementRowValue--;
            }
            System.out.println();
        }
    }
}
