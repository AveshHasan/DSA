package ESDLabT2;
//there is problem with this aaproach go for xor or replace with 0 with -1
public class EquilibriumWindow {
    public static void equiWindow(int arr[], int k)
    {
        int count=0;
        for(int i=0; i<arr.length-k; i++)
        {
            int sum = 0;
            for(int j = i; j<i+k; j++)
            {
                sum += arr[j];
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of Equilibrium Position is:"+count);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,0,1,0};
        int k =4;
        equiWindow(arr, k);

    }
}
