package BasicMaths;

public class Mathbasic {
    //Give digits of a number
    static void digit(int n)
    {
        while(n!=0)
        {
            int s = n%10;
            System.out.println(s);
            n = n/10;
        }
    }
    //Give Count of a Number
    static int count(int n)
    {
        int count = 0;
        while(n!=0)
        {
            int s = n%10;
            count++;
            n = n/10;
        }
        return count;
    }
    //Sum of digits
    static void sumofDigits(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int s = n%10;
            sum = sum + s;
            n = n/10;
        }
        System.out.println("Sum of Digits is "+sum);
    }
    //Reverse A Number
    static void reverseDigits(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int s = n%10;
            rev = rev*10+s;
            n = n/10;
        }
        System.out.println("Reversed Digits is "+rev);
    }
    //Palidrome check
    static void palindrome(int n)
    {
        int org = n;
        int rev = 0;
        while(n!=0)
        {
            int s = n%10;
            rev = rev*10+s;
            n = n/10;
        }
        if(rev==org)
        {
            System.out.println("Palindrome");;
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    //To find whether a Number is prime or not
    static boolean isPrime(int n)
    {
        for(int i =2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    //GCD of Numbers
    static int gcd(int a, int b)
    {
        //gcd(a,b) = gcd(b, a%b)
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        return ans;
    }
    static int getLCM(int a, int b)
    {
        int hcf = gcd(a,b);
        int product = a*b;
        int lcm = product/hcf;
        return lcm;
    }
    //check armstrong Number
    //Ex 153 = 1^3 + 5^3 + 3^3
    static boolean isArmstrong(int n5)
    {
        int sum = 0;
        int org = n5;
        while(n5!=0)
        {
            int digit = n5%10;
            int pow = digit*digit*digit;
            sum = sum + pow;
            n5 = n5/10;
        }
        if(sum==org)
        {
            return true;
        }
        else{
            return false;
        }
    }
    //Perfect Number Check
    //a perfect number is number after finding its divisor and taking sum of divisor which is equal to the number itself
    static boolean isPerfectnumber(int n4)
    {
        int sum = 1;
        for(int i = 2; i*i<=n4; i++)
        {
            if(n4%i == 0)
            {
                int firstFactor = i;
                int secondfactor = n4/i;
                sum = sum + firstFactor + secondfactor;
            }
        }
        if(sum == n4)
        {
            return true;
        }
        else{
            return false;
        }
    }
    static void printPrime(int n)
    {
        for(int i = 2; i<=n; i++)
        {
            boolean isprime = isPrime(i);
            if(isprime==true)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int num = 57432;
        digit(num);
        int cnt = count(num);
        System.out.println("Number Count is "+cnt);
        sumofDigits(num);
        reverseDigits(num);
        int n2= 151;
        palindrome(n2);
        int n3 = 2;
        System.out.println("Number is prime :"+isPrime(n3));
        int answer = gcd(25,12);
        System.out.println(answer);

        System.out.println("LCM of Numbers is "+getLCM(18,12));
        System.out.println("Given no. is ArmStrong Number : "+isArmstrong(151));
        System.out.println("Given Number is Perfect Number : "+isPerfectnumber(6));
        printPrime(25);
    }
}
