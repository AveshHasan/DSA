package Methods;

public class Percentage {
    static void CalcPercentage(float a, float b)
    {
        float percent = a/b*100;
        System.out.println("Obtain Percentage is: "+percent+"%");
    }
    public static void main(String[] args)
    {
        CalcPercentage(367,500);
    }
}
