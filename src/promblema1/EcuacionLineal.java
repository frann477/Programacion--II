package promblema1;

public class EcuacionLineal {
    private double a,b,c,d,e,f;

    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }    
       
    public boolean tienSolucion(){
        return (a * d - b * c) != 0.0;
    }
    public double getX(){
        return(e * d - b * f) / (a * d - b * c);
    }    
    public double getY(){  
        return(a * f - e * c) / (a * d - b * c);
    }    
}
