package edu.escuelait.tienda.controllers;

import edu.escuelait.tienda.exceptions.JugadorNotFoundException;
import edu.escuelait.tienda.services.ServiceJugadores;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jugadores")
public class JugadorRestController {


    ServiceJugadores serviceJugadores;

    JugadorRestController(ServiceJugadores serviceJugadores){
        this.serviceJugadores = serviceJugadores;
    }

    @GetMapping("/{number}")
    public ResponseEntity<?> getJugadorByNumber(@PathVariable int number){

        return this.serviceJugadores.getJugadorByNumber(number)
             .map(ResponseEntity::ok)
            .orElseThrow(JugadorNotFoundException::new);

    }

}
