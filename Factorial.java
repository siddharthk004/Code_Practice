import java.util.Scanner;

class Factorial
{
    public static void main(String arg[])
    {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 1;
        while(n > 1)
        {
            ans *= n;
            n--;
        }
        System.out.println("Total is : "+ans);

        sc.close();
    }
}
