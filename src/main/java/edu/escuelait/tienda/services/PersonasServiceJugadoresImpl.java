package edu.escuelait.tienda.services;

import edu.escuelait.tienda.domain.Persona;
import edu.escuelait.tienda.reports.ReportPdf;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Primary
@Lazy
@Service("jugadores")
@ConditionalOnProperty(prefix = "juego",name = "tipo",havingValue = "jugadores")
public class PersonasServiceJugadoresImpl implements PersonasService{

    ReportPdf reportPdf;

    public PersonasServiceJugadoresImpl(ReportPdf reportPdf){
        this.reportPdf = reportPdf;
        System.out.println("ejecutando contructor, creando instancia de esta clase");
    }

    //Almacen para tener un lote de datos prueba
    ArrayList<Persona> personas = new ArrayList<>(
            List.of(new Persona(1L,"Maradona"),
                    new Persona(2L,"Pique"),
                    new Persona(3L,"Levandovski"))
    );


    @Override
    public List<Persona> listAllPersonas() {
        this.reportPdf.generateReport(personas);
        return this.personas;
    }
}

