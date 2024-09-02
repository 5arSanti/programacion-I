public static void ShowPower (int initialValue, int endValue, int powerValue) {
    for (int i = initialValue; i <= endValue; i++ ) {
        System.out.println(CalculatePower(i, powerValue));
    }
}