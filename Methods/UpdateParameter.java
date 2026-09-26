package Methods;

public class UpdateParameter {
    static int isUpdated(int n)
    {
        System.out.println("Before Update: "+n);
        n = 10;
        System.out.println("After Update: "+n);
        return n;
    }
    public static void main(String[] args)
    {
        int s =25;
        System.out.println("Initial value:"+s);
        int ans = isUpdated(s);
        System.out.println("Main Method value Returned: "+ans);
        System.out.println("Value After Updation: "+s);
    }
}
