package edu.escuelait.tienda.reports;

import edu.escuelait.tienda.domain.Persona;
import edu.escuelait.tienda.stereotypes.Report;

import java.util.List;

@Report
public class ReportPdf {

    public void generateReport(List<Persona> personas){
        System.out.println("Generate PDF Report");
        personas.forEach(persona -> {
            System.out.println("Persona " + persona.toString());
        });
    }

}
