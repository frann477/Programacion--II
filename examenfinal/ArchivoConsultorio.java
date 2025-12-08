
package com.mycompany.examenfinal;

import java.io.File;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ArchivoConsultorio {
    private String nombre;
     public ArchivoConsultorio() {
        this.nombre = "Consultorio.json";
    }
    public ArchivoConsultorio(String nombre) {
        this.nombre = nombre;
        
        try {
            File f = new File(nombre);
            if (!f.exists()) {
                ArrayList<Consultorio> cons = new ArrayList<>();                
                try(FileWriter nuevo = new FileWriter(this.nombre)){
                    new Gson().toJson(cons,nuevo);
                }
            }
            
        } catch (Exception e) {
            System.out.println("error al iniciar archivo consultorio");
        }
    }
    public List<Consultorio> leerArchivo()
    {
        try{
           File arch = new File(this.nombre);
           if (!arch.exists()){
               return new ArrayList<>();
           }
           else{
               java.lang.reflect.Type lista = new TypeToken<List<Consultorio>>() {}.getType();
               List<Consultorio> resultado = new Gson().fromJson(new FileReader(this.nombre), lista);
               if (resultado == null) {
                   return new ArrayList<>();
               }
               return resultado;
           }
       }
       catch(Exception e){
           System.out.println(e);
           return new ArrayList<>();
       }
    }
    public void modificar(List<Consultorio> cons){
        try(FileWriter escritor = new FileWriter(this.nombre)){
            new Gson().toJson(cons, escritor);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
