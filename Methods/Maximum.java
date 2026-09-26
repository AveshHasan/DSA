package Methods;

public class Maximum {
    static int isMax(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String[] args)
    {
        int ans = isMax(25,150);
        System.out.println("Maximum of two number is: "+ans);

    }
}
