public class Vectores {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int x[] = {0,0};
     
        
        float prom = Funciones.MaxMinProd(a, x);
        
        System.out.print("Promedio: " + prom + "\n");
        Funciones.Imprime(x);
    }
}