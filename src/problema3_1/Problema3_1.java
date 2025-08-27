package problema3_1;

import java.util.Scanner;
public class Problema3_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        System.out.println("Ingrese 10 numeros:");
        //1.9 2.5 3.7 2 1 6 3 4 5 2
        for (int i = 0; i < 10; i++){
            v[i] = sc.nextDouble();
        }
        Estadistica e1 = new Estadistica(v);
        System.out.printf("El promedio es %.2f\n", e1.getPromedio());
        System.out.printf("La desviacion estandard es %.5f\n", e1.getDesviacion());
    }
    
}
