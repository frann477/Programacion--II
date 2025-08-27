package problema3;

import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        System.out.println("Ingrese 10 numeros: ");
        //1.9 2.5 3.7 2 1 6 3 4 5 2
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
        }
        double prom = Estadistica.promedio(v);
        double des = Estadistica.desviacion(v);
        System.out.printf("El promedio es %.2f\n", prom);
        System.out.printf("La desviacion estandard es %.5f\n", des);        
    }    
}
