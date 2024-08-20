public class Formats 
{
    public static void main(String[] args) 
    {
        // %c formats a character or char.
        // %s formats a string.
        // %d formats integers.
        // %f formats floating-point or decimals.
        // %t formats date and time.
        // %b formats boolean values or conditional expressions.
        // %e formats exponential floating-point numbers.
        // %n is used as a newline character and takes the cursor to the next line.
        // %x notacion hexadecimal
        // %E  
        
        char charValue = '@';
        String name = "Hi, my name is Johel";
        int intValue = 1000;
        float floatValue = 15.72f;
        boolean booleanValue = true;
        double exponentialValue = 123124;
        
        // Example
        // No funciona debido a que el formato %d, es utilizado para formatear valores enteros (int)
        // System.out.printf("%d%n", charValue);
        // Funciona debido a que el plus (+) antes de la variable devuelve la representacion numerica de un objeto (Char)
        //System.out.printf("Valor '@' en valor numerico ASCII: %d %n %n", +charValue);
            
        
        // System.out.printf("Char: %c %n",charValue);
        // System.out.printf("String: %s %n", name);
        // System.out.printf("Entero: %d %n", intValue);
        // System.out.printf("Flotante: %f %n", floatValue);
        // System.out.printf("Booleano: %b %n", booleanValue);
        // System.out.printf("Exponencial: %e %n", exponentialValue);
        
        int valor1 = 12;
        double valor2 = 12034.565;
        
        //System.out.printf("Numero principal: %d\n%.3f\n", valor1, valor2);
        
        int xx = 20;
        int yy = 50;
        
        System.out.printf("%d", (float) xx / (float) yy);
    }
}
