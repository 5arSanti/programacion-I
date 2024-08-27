import java.util.Scanner;
public class Classes 
{
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int intValue;
        char charValue;
        String stringValue;
        float floatValue;
        double doubleValue;
        byte byteValue;
        short shortValue;
        boolean booleanValue;
        
        // Inputs

        System.out.print("Digite un numero: ");
        intValue = entrada.nextInt();
        
        System.out.print("Digite un char: ");
        charValue = entrada.next().charAt(0);

        System.out.print("Digite una palabra: ");
        stringValue = entrada.next();
        
        System.out.print("Digite un flotante: ");
        floatValue = entrada.nextFloat();
        
        System.out.print("Digite un double: ");
        doubleValue = entrada.nextDouble();
        
        System.out.print("Digite un byte: ");
        byteValue = entrada.nextByte();
        
        System.out.print("Digite un short: ");
        shortValue = entrada.nextShort();

        System.out.print("Digite un booleano: ");
        booleanValue = entrada.nextBoolean();

        // Salida

        System.out.printf("%nEntero: %d %n", intValue);

        System.out.printf("Char: %c %n", charValue);

        System.out.printf("Palabra: %s %n", stringValue);

        System.out.printf("Flotante: %f %n", floatValue);

        System.out.printf("Double: %e %n", doubleValue);

        System.out.printf("Byte: %d %n", byteValue);

        System.out.printf("Short: %d %n", shortValue);

        System.out.printf("Booleano: %b %n", booleanValue);
    }
}
