import java.util.Scanner;

class AreaCIRCLE
{
    public static void main(String arg[])
    {
        System.out.println("Area of Circle\n");
        double PI = Math.PI;

        System.out.println("Enter R For Area of Circle : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double ans = PI*(r*r);
        System.out.println("Ans : "+ans);

        System.out.println("Area of Circumference\n");
        System.out.println("Enter R For Area of Circumference : ");
        r = sc.nextInt();
        ans = 2*PI*r;
        System.out.println("Ans : "+ans);

        sc.close();
    }
}