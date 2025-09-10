
package practica2;

public class Practica2 {

    public static void main(String[] args) {
        MiEntero m1 = new  MiEntero(2);
        System.out.println("m1 es par: " + m1.esPar());
        System.out.println("m1 es impar: " + m1.esImpar());
        System.out.println("m1 es primo: " + m1.esPrimo());
        
        System.out.println("3 es par: " + MiEntero.esPar(3));
        System.out.println("3 es impar: " + MiEntero.esImpar(3));
        System.out.println("3 es primo: " + MiEntero.esPrimo(3));
        
        MiEntero m2 = new MiEntero(7);
        System.out.println("m2 es par: " + MiEntero.esPar(m2));
        System.out.println("m2 es impar: " + MiEntero.esImpar(m2));
        System.out.println("m2 es primo: " + MiEntero.esPrimo(m2));
        
        System.out.println("---------metodo equals------------");
        
        MiEntero m3 = new MiEntero(5);
        MiEntero m4 = new MiEntero(5);
        m3.equals(m4);
        System.out.println("---------metodos parseInt---------");
        
        char v[] = new char[3];
        v[0] = '1';   
        v[1] = '4';
        v[2] = '3';
        System.out.println("parseInt: " + MiEntero.parseInt(v));
        
        String cadena = "123321";
        System.out.println("parseInt: " + MiEntero.parseInt(cadena));
    }
}