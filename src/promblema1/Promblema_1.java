package promblema1;

import java.util.Scanner;

public class Promblema_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a,b,c,d,e,f: ");
        double a =  sc.nextDouble();
        double b =  sc.nextDouble();
        double c =  sc.nextDouble();
        double d =  sc.nextDouble();
        double e =  sc.nextDouble();
        double f =  sc.nextDouble();
        
        EcuacionLineal ec = new EcuacionLineal(a, b, c, d, e, f);
        //Ingrese a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
        System.out.println(ec.tienSolucion());
        System.out.println(ec.getX());
        System.out.println(ec.getY());
        
    }
    
}
