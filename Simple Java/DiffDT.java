import java.util.Scanner;

class DiffDT
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Int = "+Integer.SIZE/8);
        System.out.println("char = "+Character.SIZE/8);
        System.out.println("double = "+Double.SIZE/8);
        System.out.println("float = "+Float.SIZE/8);

        sc.close();
    }
}
