import java.util.Scanner;

class ASCII
{
    public static void main(String arg[])
    {
        System.out.println("ASCII Value of all Characters \n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        int ans = (int)ch;
        
        System.out.println("Ans = "+ch+" "+ans);
        sc.close();
    }
}