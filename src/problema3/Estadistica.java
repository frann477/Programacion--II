package problema3;

public class Estadistica {
    
    public static double promedio(double[] prom) {
    double s = 0.0;
    for (int i = 0; i < prom.length; i++) {
        s += prom[i];
    }
    return s / prom.length;
}

public static double desviacion(double[] des) {
    double p = promedio(des);
    double sumaCuad = 0;
    for (int i = 0; i < des.length; i++) {
        sumaCuad += Math.pow(des[i] - p, 2);
    }
    return Math.sqrt(sumaCuad / (des.length - 1));
}

}
