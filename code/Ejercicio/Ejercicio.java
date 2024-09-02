import java.util.Scanner;

public static Scanner entrada = new Scanner(System.in);

public class Ejercicio 
{
    public static void main(String[] args) {
        int intitialValue, endValue, powerValue;

        intitialValue = IntInput("Digite el valor inicial: ");
        endValue = IntInput("Digite el valor final: ");
        powerValue = IntInput("Digite el valor de potenciación: ");

        ShowPower(intitialValue, endValue, powerValue);
    }
}