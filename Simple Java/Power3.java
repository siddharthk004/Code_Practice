import java.util.Scanner;

class Power3
{
    public static void main(String arg[])
    {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("N^1 : "+n*1);
        System.out.println("N^2 : "+n*n);
        System.out.println("N^3 : "+n*n*n);

        sc.close();
    }
}
