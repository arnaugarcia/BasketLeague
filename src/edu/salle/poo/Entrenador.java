package edu.salle.poo;

import java.time.LocalDate;

public class Entrenador extends Persona {

    private LocalDate dataDebut;
    private Integer titolsAconseguits;

    public Entrenador(String nom,
                      LocalDate dataNaixement,
                      String nacionalitat,
                      LocalDate dataDebut,
                      Integer titolsAconseguits) {
        super(nom, dataNaixement, nacionalitat);
        this.dataDebut = dataDebut;
        this.titolsAconseguits = titolsAconseguits;
    }
}
