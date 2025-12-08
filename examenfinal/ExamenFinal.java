
package com.mycompany.examenfinal;

public class ExamenFinal {

    public static void main(String[] args) {
        
        Medico m1 = new Medico("juan", "lopez", 1, 8);
        Medico m2 = new Medico("juan", "lopez", 2, 8);
        Medico m3 = new Medico("juan", "lopez", 3, 8);
        
        Consulta c1 = new Consulta("enfermito1", "ruiz","diciembre", 219312, 1, 20, 2025);
        Consulta c2 = new Consulta("enfermo2", "perez","diciembre", 219312, 1, 25, 2025);
        Consulta c3 = new Consulta("enfermo3", "ruiz","diciembre", 219312, 1, 20, 2025);
        Consulta c4 = new Consulta("enfermo4", "perez","diciembre", 219312, 1, 28, 2025);
        Consulta c5 = new Consulta("enfermito5", "ruiz","diciembre", 219312, 1, 20, 2025);
        Consulta c6 = new Consulta("enfermo6", "perez","diciembre", 219312, 1, 10, 2025);
        Consulta c7 = new Consulta("enfermito7", "ruiz","diciembre", 219312, 1, 20, 2025);
        Consulta c8 = new Consulta("enfermo8", "perez","diciembre", 219312, 1, 30, 2025);
        Consulta c9 = new Consulta("enfermo9", "perez","diciembre", 219312, 1, 29, 2025);
        
        Consultorio con = new Consultorio();
        /*con.agregarConsulta(c1);
        con.agregarMedico(m1);
        */
        
        con.altaMedico(m1);
        con.altaMedico(m2);
        con.altaMedico(m3);
        /*
        con.altaConsulta(c1);
        con.altaConsulta(c2);
        con.altaConsulta(c3);
        con.altaConsulta(c4);
        con.altaConsulta(c5);
        con.altaConsulta(c6);
        con.altaConsulta(c7);
        con.altaConsulta(c8);
        con.altaConsulta(c9);*/
        
        
                                    
    }
}
