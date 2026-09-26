package ESDLabT2;

public class CreateArray {
    public static void returnNegative(int arr[], int k)
    {
        int arr2[] = new int[arr.length];
        for(int i =0; i<=arr.length-k; i++)
        {
            for(int j = i; j<i+k; j++)
            {
                if(arr[j]<=0)
                {
                    arr2[i] = arr[j];
                    System.out.print(arr2[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={1,2,-3,4,-1,6,0,5};
        int k =3;
        returnNegative(arr, k);

    }
}
