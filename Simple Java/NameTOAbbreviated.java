import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NameTOAbbreviated
{
    public static void main(String arg[])
    {
        System.out.println("AREA of Triangle \n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Person Name : ");
        String person = sc.next();
        
        System.out.println("Enter Person Abbreviated name : ");
        String Abbr = sc.next();

        if(Abbr.length() > person.length())
        {
            System.out.println("Not Abbreviated");
        }
        else
        {
            Map<Integer,Character> mp = new HashMap<>();
            for(int i = 0;i < person.length();i++)
            {
                System.out.println(mp);
            }
        }
        sc.close();
    }
}
