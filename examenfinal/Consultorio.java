
package com.mycompany.examenfinal;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;

public class Consultorio {
    private String consultas,medicos;

    private Gson gson = new Gson();

    public Consultorio() {
        cargar();
    }
    public Consultorio(String consultas, String medicos) {
        this.consultas = consultas;
        this.medicos = medicos;
    }
    /*public void agregarMedico(Medico m)
    {
        this.medicos=m.toString();
    }
    public void agregarConsulta(Consulta c)
    {
        this.consultas=c.toString();
    }*/
    private void cargar() {
        try {
            FileReader fr = new FileReader("consultorio.json");
            Consultorio c = gson.fromJson(fr, Consultorio.class);
            this.consultas = c.consultas;
            this.medicos = c.medicos;
            Gson gson = new Gson();
        } catch (Exception e) {  
            System.out.println("error al cargar");
            consultas = "[]";
            medicos = "[]";
        }
    }

    private void guardar() {
        try (FileWriter fw = new FileWriter("consultorio.json")) {
            fw.write(gson.toJson(this));
            Gson gson = new Gson();
        } catch (Exception e) {
            System.out.println("error guardando el archivo.");
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<Medico> getListaMedicos() {
        return gson.fromJson(medicos, new TypeToken<ArrayList<Medico>>(){}.getType());
    }

    private ArrayList<Consulta> getListaConsultas() {
        return gson.fromJson(consultas, new TypeToken<ArrayList<Consulta>>(){}.getType());
    }

    private void setListaMedicos(ArrayList<Medico> lista) {
        medicos = gson.toJson(lista);
        guardar();
    }

    private void setListaConsultas(ArrayList<Consulta> lista) {
        consultas = gson.toJson(lista);
        guardar();
    }

    public void altaMedico(Medico m) {
        ArrayList<Medico> lista = getListaMedicos();
        lista.add(m);
        setListaMedicos(lista);
        System.out.println("SE DIO DE ALTA AL MEDICO");
    }

    public void bajaMedico(String nom, String ape) {
        ArrayList<Medico> listaMed = getListaMedicos();
        ArrayList<Consulta> listaCon = getListaConsultas();

        
        Integer idBorrar = null;
        for (Medico m : listaMed) {
            if (m.getNombreMed().equalsIgnoreCase(nom) &&
                m.getApellidoMed().equalsIgnoreCase(ape)) {
                idBorrar = m.getIdMed();
                listaMed.remove(m);
                break;
            }
        }

        if (idBorrar != null) {
            
            for (int i = 0; i < listaCon.size(); i++) {
            Consulta c = listaCon.get(i);

                if (c.getIdMed() == idBorrar) {
                    listaCon.remove(i);
                    i--; 
                }
            }
            setListaMedicos(listaMed);
            setListaConsultas(listaCon);
        }
        System.out.println("SE DIO DE Baja AL MEDICO");
    }

    public void altaConsulta(Consulta c) {
        ArrayList<Consulta> lista = getListaConsultas();
        lista.add(c);
        setListaConsultas(lista);
        System.out.println("SE DIO DE alta la consulta");
    }

    public void moverNavidadAnoNuevo() {
        ArrayList<Consulta> consultas = getListaConsultas();

        for (Consulta c : consultas) {
            if (c.getDia() == 25 && c.getMes().equals("diciembre")) {
                c.setDia(26);
                System.out.println("se cambio la fecha por navidad ");
            }
            if (c.getDia() == 1 && c.getMes().equals("enero")) {
                c.setDia(2);
                System.out.println("se cambio la fecha por año nuevo ");
            }
        }

        setListaConsultas(consultas);        
    }
    public void pacientesCumpleaños()
    {
        ArrayList<Consulta> consultas = getListaConsultas();
        
        for (Consulta consulta : consultas) {
            if (consulta.getDia()==8) {
                System.out.println("pacientes el dia de mi cumpleaños:");
                System.out.println(consulta);
            }
        }
    }

    @Override
    public String toString() {
        return "Consultorio{" + "consultas=" + consultas + ", medicos=" + medicos + '}';
    }
       
}
