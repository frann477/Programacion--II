package problema3_1;

public class Estadistica {
    private double[] v;

    public Estadistica(double[] d) {
        this.v = d;
    }

    public double getPromedio() {
        double s = 0;
        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }
        return s / v.length;
    }

    public double getDesviacion() {
        double prom = getPromedio();
        double suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += Math.pow(v[i] - prom, 2);
        }
        return Math.sqrt(suma / (v.length - 1));
    }
}

