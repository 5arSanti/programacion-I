package com.mycompany.vectores;

public class Funciones {
    
    public static void Imprime(int x[]) 
    {
        for(int i = 0; i < x.length; i++) 
        {     
            System.out.println(x[i] + " ");
        }
       
        System.out.println("-------------------");
    }
    
    public static void ImprimeS(String x[], int limi) 
    {
        for(int i = 0; i < limi; i++) 
        {
            System.out.println(x[i] + " ");
        }
        System.out.println("-------------------");

    }
    
    public static float MaxMinProd(int values[], int result[]) 
    {
        int sum = 0;
        int max = values[0];
        int min = values[0];

        
        for (int i = 0; i < values.length; i ++) {    
            
            if (values[i] > max){
                max = values[i];
            }
            if (values[i] < min){
                min = values[i];
            }
            
            sum += values[i];
        }
        result[0] = max;
        result[1] = min;
        
        float prom = sum/values.length;
        
        return prom;
    }
    
}
