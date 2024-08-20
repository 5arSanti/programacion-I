public class Operadores
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

        System.out.printf("%d %n", value1 | value2);
        


        // --------------------------------------------------------
        // Mueve el bit n posiciones a la izquierda
        
        System.out.printf("Operador << %n");
        
        int value4, value5;
        
        value4 = 30;
        
        value4 = value4<<1; // Mueve el valor del bit una posicion a la izquierda
        value5 = value4<<2; // Mueve el valor del bit dos posiciones a la izquierda
        
        System.out.printf("Valor 4: %d %n", value4);
        System.out.printf("Valor 5: %d %n", value5);
    

        // --------------------------------------------------------
        // Se utiliza para recuperar el complemento de un dato de tipo char o int
        System.out.printf("Operador ~ %n");

        int value6, value7;

        value6 = 245;

        
        value7 = ~value6; // Mueve el valor del bit una posicion a la izquierda
        
        System.out.printf("Valor 6: %d %n", value6);
        System.out.printf("Valor 7: %d %n", value7);

        value6 = ~value7;

        System.out.printf("Valor 6: %d %n", value6);

    }
}

