import java.util.Scanner;

class Percentage
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of English : ");
        int Eng = sc.nextInt();
        System.out.println("Enter Marks of Marathi : ");
        int Mar = sc.nextInt();
        System.out.println("Enter Marks of Math : ");
        int Math = sc.nextInt();
        System.out.println("Enter Marks of Science : ");
        int Sci = sc.nextInt();
        System.out.println("Enter Marks of Geography : ");
        int Geo = sc.nextInt();

        double total = Eng+Mar+Math+Sci+Geo;
        double percentage = (total/500)*100;
        System.out.println("Total percentage = "+percentage+"%");

        sc.close();
    }
}
