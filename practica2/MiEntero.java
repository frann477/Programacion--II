
package practica2;

public class MiEntero {
   
    private int valor;
    
    public MiEntero()
    {
        valor=0;
    }
    public MiEntero(int v)
    {
        valor=v;
    }
    public int getValor()
    {
        return valor;
    }
    public boolean esPar()
    {
        if (valor%2==0) {
            return true;
        }
        return false;
    }
    public boolean esImpar()
    {
        if (valor%2!=0) {
            return true;
        }
        return false;
    }
    public boolean esPrimo()
    {   
        int cont=0;
        for (int i = 1; i <= valor; i++) {
            if (valor%i==0) {
                cont++;
            }
        }
        if (cont==2) {
            return true;
        }
        return false;
    }
    public static boolean esPar(int x)
    {
        if (x%2==0) {
            return true;
        }
        else{
        return false;
        }
        
    }
    public static boolean esImpar(int x)
    {
        if (x%2==0) {
            return true;
        }
        else{
            return true;
        }
        
    }
    public static boolean esPrimo(int x)
    {   
        int cont=0;
        for (int i = 1; i <= x; i++) {
            if (x%i==0) {
                cont++;
            }
        }
        if (cont==2) {
            return true;
        }
        return false;
    }
    
    public static boolean esPar(MiEntero x)
    {
        if (x.getValor()%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean esImpar(MiEntero x)
    {
        if (x.getValor()%2!=0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean esPrimo(MiEntero x)
    {   
        int cont=0;
        for (int i = 1; i <= x.getValor(); i++) {
            if (x.getValor()%i==0) {
                cont++;
            }
        }
        if (cont==2) {
            return true;
        }
        return false;
    }
    public void equals(MiEntero x)
    {
        if (valor==x.getValor()) {
            System.out.println("son iguales!!!");
        }
        else{System.out.println("NO son iguales!");}
    }
   //Un método estático parseInt(char[]) convierte un arreglo de caracteres 
    //numéricos en un valor int.
   //■ Un método estático parseInt(String) convierte una cadena en un valor int.
    public static int parseInt(char[] x)
    {
        int nuevoNumero=0;
        for (int i = 0; i < x.length; i++) {
            nuevoNumero = nuevoNumero*10+x[i];
        }
        return nuevoNumero;
    }
    public static int parseInt(String x)
    {
        int nuevoNumero=0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            nuevoNumero=nuevoNumero*10+(c - '0');
        }
        return nuevoNumero;
    }
}
