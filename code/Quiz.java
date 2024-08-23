public class Quiz 
{
    public static void main(String[] args) 
    {
        int a,b, R;

        char c;

        a = 023;
        b = 100;
        c = 'A';

        b = b>>2;

        System.out.printf("%d %n", b);

        R = (a^b & c) | 0xa;

        System.out.printf("%d %n %n", R);
    }
}
