
package com.mycompany.examen2;

import java.util.ArrayList;

public class Linea {
    private String color;
    private ArrayList<Persona>filaPersonas;
    private ArrayList<Cabina>cabinas;
    private int cantCabinas;

    public Linea(String color) {
        this.color = color;
    }

    public Linea(String color, ArrayList<Cabina> cabinas) {
        this.color = color;
        this.cabinas = cabinas;
    }
    
    public void agregarPersona(Persona p)
    {
        filaPersonas.add(p);
    }
    public void agregarCabina(int nroCab)
    {    
        Cabina c = new Cabina(nroCab);
    }

    
    public String getColor() {
        return color;
    }

    public ArrayList<Persona> getFilaPersonas() {
        return filaPersonas;
    }

    public ArrayList<Cabina> getCabinas() {
        return cabinas;
    }

    public int getCantCabinas() {
        return cantCabinas;
    }
    
}
