package Methods;

public class Overloading {
    static void display(int a, int b)
    {
        int sum = a+b;
        System.out.println("Integer Method display");
        System.out.println("Sum is: "+sum);
    }
    static void display(String s)
    {
        System.out.println("String Method display");
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        display(25,35);
        display("HI Avesh");

    }
}
