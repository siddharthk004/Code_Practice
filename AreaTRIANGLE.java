import java.util.Scanner;

class AreaTRIANGLE
{
    public static void main(String arg[])
    {
        System.out.println("AREA of Triangle \n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base : ");
        int b = sc.nextInt();

        System.out.println("Enter Height : ");
        int h = sc.nextInt();
        
        System.out.println("Ans =  "+((b*h)/2));
        sc.close();
    }
}