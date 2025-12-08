
package com.mycompany.examenfinal;


public class Consulta {
    private String nombrePaciente,apellidoPaciente,mes;
    private int ci,idMed,dia,año;

    public Consulta(String nombrePaciente, String apellidoPaciente, String mes, int ci, int idMed, int dia, int año) {
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.mes = mes;
        this.ci = ci;
        this.idMed = idMed;
        this.dia = dia;
        this.año = año;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    

    @Override
    public String toString() {
        return "Consulta{" + "nombrePaciente=" + nombrePaciente + ", apellidoPaciente=" + apellidoPaciente + ", mes=" + mes + ", ci=" + ci + ", idMed=" + idMed + ", dia=" + dia + ", a\u00f1o=" + año + '}';
    }
    
    
}
