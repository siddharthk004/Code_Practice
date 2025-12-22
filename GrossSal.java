import java.util.Scanner;

class GrossSal
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee CTC : ");
        int CTC = sc.nextInt();
        double Tax = 0.0;
        double pf = 12*(CTC/100);
        if(CTC > 1200000)
        {
            Tax = 30*(CTC/100);
        } 
        System.out.println("CTC = "+CTC);
        System.out.println("Tax = "+Tax);
        System.out.println("PF = "+pf);
        System.out.println("Total In-hand Salary = "+((CTC-pf)-Tax));

        sc.close();
    }
}
