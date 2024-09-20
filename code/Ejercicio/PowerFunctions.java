public class PowerFunctions 
{
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

