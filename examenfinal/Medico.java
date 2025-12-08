
package com.mycompany.examenfinal;

public class Medico {
    private String nombreMed,apellidoMed;
    private int idMed,añosExperiencia;

    public Medico(String nombreMed, String apellidoMed, int idMed, int añosExperiencia) {
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.idMed = idMed;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getApellidoMed() {
        return apellidoMed;
    }

    public void setApellidoMed(String apellidoMed) {
        this.apellidoMed = apellidoMed;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    @Override
    public String toString() {
        return "Medico{" + "nombreMed=" + nombreMed + ", apellidoMed=" + apellidoMed + ", idMed=" + idMed + ", a\u00f1osExperiencia=" + añosExperiencia + '}';
    }
    
    
}
