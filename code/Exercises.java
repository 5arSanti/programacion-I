public class Exercises
{
    public static void main(String[] args)
    {
        int a,b;

        a = '@';

        b = (~a) & 0x145;
    
        System.out.printf("%d %n", 0x145);
        System.out.printf("%d %d %n",a, b);
    }
}