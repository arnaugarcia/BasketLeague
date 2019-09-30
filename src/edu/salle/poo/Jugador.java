package edu.salle.poo;

import java.time.LocalDate;

public class Jugador extends Persona {

    private Integer altura;
    private Float pes;
    private String posicio;

    public Jugador(String nom,
                   LocalDate dataNaixement,
                   String nacionalitat,
                   Integer altura,
                   Float pes,
                   String posicio) {
        super(nom, dataNaixement, nacionalitat);
        this.altura = altura;
        this.pes = pes;
        this.posicio = posicio;
    }
}
