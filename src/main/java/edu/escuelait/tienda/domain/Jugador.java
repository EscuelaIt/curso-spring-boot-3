package edu.escuelait.tienda.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class Jugador {

    @NonNull
    private String nombre;

    @NonNull
    private int numero;

}
