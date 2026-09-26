public class AlphaBack {
    public static void main(String [] args)
    {
        int n = 5;
        for(int i =1; i<=n; i++)
        {
            for(int j = 1; j<=i;j++)
            {
                int a = n-j;
                int b = 'A';
                int ans = a+b;
                char ansfinal = (char)ans;
                System.out.print(ansfinal);
            }
            System.out.println();
        }
    }
}
