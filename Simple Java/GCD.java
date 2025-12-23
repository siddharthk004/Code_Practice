import java.util.Scanner;

class GCD
{
    public static int gcd(int a,int b)
    {
        if(a == b)  return a;
        if(a > b)
            return gcd(a-b,b);
        return gcd(a,b-a);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number a : ");
        int a = sc.nextInt();

        System.out.println("Enter an number b : ");
        int b = sc.nextInt();

        int ans  = gcd(a,b);
        System.out.println(ans);

        sc.close();
    }
}
