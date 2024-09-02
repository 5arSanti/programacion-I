public static String CalculatePower (int base, int potencia) {
    int result = 1;
    for (int i = 0; i < potencia; i++) {
        result *= base;
    }
    return (base + " ^ " + potencia + " = " + result);
}