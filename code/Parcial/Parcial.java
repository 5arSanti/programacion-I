package com.mycompany.mavenproject1;

import java.util.Scanner;



public class Mavenproject1 {

    public static Scanner entrada = new Scanner(System.in);

    public static String Compara(int value1, int value2) {
        
        int count1 = Count(value1);
        int count2 = Count(value2);
        
        String returnValue = "";

        if (count1 > count2) {
            returnValue = "Uno";
        }
        if (count1 < count2) {
            returnValue = "Dos";
        }
        if (count1 == count2) {
            returnValue = "Igual";
        }
        
        return returnValue;
    }
    
    public static int Count(int value) {
        int count = 0;
        
        String stringifiedNumber = String.valueOf(value);

        String[] digits = stringifiedNumber.split("(?<=.)");
        
        for (int i = 0; i < digits.length; i++) {
            String item = digits[i];
            
            int intValue = Integer.parseInt(item);
            
            if (intValue % 2 == 0) {
                count += 1;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String returnedValue;
        
        int firstNumber, secondNumber;
        
        System.out.println("Digite el primer numero");
        firstNumber = entrada.nextInt();
        
        System.out.println("Digite el segundo numero");
        secondNumber = entrada.nextInt();
        
        returnedValue = Compara(firstNumber, secondNumber);
        
        if (returnedValue != "Igual") {
            System.out.println("El numero con mas digitos pares es el numero " + returnedValue);
        } else {
            System.out.println("Los numeros tienen la misma cantidad de digitos pares: " + returnedValue);
        }
        
    }


}
