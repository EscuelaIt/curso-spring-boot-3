package edu.escuelait.tienda.services;

import edu.escuelait.tienda.domain.Persona;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("astronautas")
@ConditionalOnProperty(prefix = "juego",name = "tipo",havingValue = "astronautas")
public class PersonasServiceImpl implements PersonasService{

    //Almacen para tener un lote de datos prueba
    ArrayList<Persona> personas = new ArrayList<>(
            List.of(new Persona(1L,"Armstrong"),
                    new Persona(2L,"Aldrin"),
                    new Persona(3L,"Collins"))
    );


    @Override
    public List<Persona> listAllPersonas() {
        return this.personas;
    }
}

