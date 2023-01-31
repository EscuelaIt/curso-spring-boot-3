package edu.escuelait.tienda.services;

import edu.escuelait.tienda.domain.Jugador;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceJugadores {

    public Optional<Jugador> getJugadorByNumber(int number){

        if (number == 10){
            return Optional.of(new Jugador("maradona",10));
        }

        return Optional.empty();

    }

}
