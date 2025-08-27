package problema2;

import java.util.Scanner;


public class Problema_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a,b,c: ");
        double a =  sc.nextDouble();
        double b =  sc.nextDouble();
        double c =  sc.nextDouble();
        
        EcuacionLineal e1 = new EcuacionLineal(a, b,c);
        /*  Ingrese a, b, c: 1.0 3 1
            Ingrese a, b, c: 1 2.0 1
            Ingrese a, b, c: 1 2 3*/
        
        if(e1.getDiscriminante() > 0){
            System.out.println(String.format("La ecuacion tiene dos raices %.2f y %.2f", e1.getRaiz1(), e1.getRaiz2()));

        }
        else if(e1.getDiscriminante() == 0){
            System.out.println(String.format("La ecuacion tiene una raiz %.2f", e1.getRaiz1()));
            
        }
        else{
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
    
}
