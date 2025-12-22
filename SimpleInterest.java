import java.util.Scanner;

class SimpleInterest
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Money in RUPEE : ");
        int Money = sc.nextInt();
        
        System.out.println("Enter Year To Invest at 7.2% per Anum : ");
        int yr = sc.nextInt();

        double ans = Money / 100;
        double total = ((ans*7.2)*yr);
        ans = total+Money;

        System.out.println("Total Amout Get After "+yr+" Year = "+ans+ " Total Interst Amount = "+total);

        sc.close();
    }
}
