package Array;

public class Array2D {
    public static void main(String[] args)
    {
        //Declaration
        int arr[][];
        //Allocation
        arr = new int[3][3];
        //Initialization
        /*int brr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };*/
        //if Array column id jagged or  of multiple length
        int brr[][]={
            {1,2,3},
            {4,5,6,8,12},
            {7,8}
        };
        //System.out.println(brr[2][2]);
        int rowlength = brr.length;
        //int collength = brr[0].length;
        for(int i =0; i<rowlength; i++)
        {
            //Find length for each column
            int collength = brr[i].length;
            for(int j = 0; j<collength; j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    
}
