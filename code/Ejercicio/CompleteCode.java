import java.util.Scanner;

public static Scanner entrada = new Scanner(System.in);

public class CompleteCode 
{
    public static void main(String[] args) 
    {
        int intitialValue, endValue, powerValue;

        intitialValue = IntInput("Digite el valor inicial: ");
        endValue = IntInput("Digite el valor final: ");
        powerValue = IntInput("Digite el valor de potenciación: ");

        ShowPower(intitialValue, endValue, powerValue);
    }

    public static int IntInput(String textValue) {
        int inputValue = 0;

        System.out.println(textValue);
        inputValue = entrada.nextInt;

        return (inputValue);
    }

    public static String CalculatePower (int base, int potencia) {
        int result = 1;
        for (int i = 0; i < potencia; i++) {
            result *= base;
        }
        return (base + " ^ " + potencia + " = " + result);
    }

    public static void ShowPower (int initialValue, int endValue, int powerValue) {
        for (int i = initialValue; i <= endValue; i++ ) {
            System.out.println(CalculatePower(i, powerValue));
        }
    }
}