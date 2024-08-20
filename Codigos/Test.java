public class Test
{
    public static void main(String[] args) 
    {
        System.out.printf("Hola, este es un archivo ejecutado directamente en consola %n");

        // --------------------------------------------------------

        System.out.printf("Ejercicio 1: %n");

        int a,b,c, d;

        a = 127;
        b = 126;
        c = a & b;

        System.out.printf("a & b: %d %n %n", c);

        // --------------------------------------------------------

        System.out.printf("Ejercicio 2: %n");

        char X;
        X = 'A';

        d = +X & 127;

        System.out.printf("A & 127: %d %n", d);

        // --------------------------------------------------------

        System.out.printf("Ejercicio 2: %n");

        int value1, value2;
        value1 = 128;
        value2 = 3;

        System.out.printf("%d", value1 | value2);
    }
}
