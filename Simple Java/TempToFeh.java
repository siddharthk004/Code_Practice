import java.util.Scanner;

class TempToFeh
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature : ");
        int Temp = sc.nextInt();
        double total = Temp*(9/5)+32;
        System.out.println("celcius = "+Temp+" Fehrenheit = "+total);

        sc.close();
    }
}
