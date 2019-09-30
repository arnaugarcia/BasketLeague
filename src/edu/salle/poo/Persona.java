package edu.salle.poo;

import java.time.LocalDate;

public abstract class Persona {

    private String nom;
    private LocalDate dataNaixement;
    private String nacionalitat;

    public Persona(String nom, LocalDate dataNaixement, String nacionalitat) {
        this.nom = nom;
        this.dataNaixement = dataNaixement;
        this.nacionalitat = nacionalitat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", dataNaixement=" + dataNaixement +
                ", nacionalitat='" + nacionalitat + '\'' +
                '}';
    }
}
