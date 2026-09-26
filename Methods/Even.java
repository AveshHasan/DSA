package Methods;

public class Even {
    static boolean isEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        int n = 270;
        boolean ans = isEven(n);
        System.out.println(ans);
    }
}
