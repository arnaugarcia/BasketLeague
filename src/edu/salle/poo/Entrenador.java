package edu.salle.poo;

import java.time.LocalDate;

public class Entrenador extends Persona {

    private LocalDate dataDebut;
    private Integer titolsAconseguits;
    private Equip equip;

    public Entrenador(String nom,
                      LocalDate dataNaixement,
                      String nacionalitat,
                      LocalDate dataDebut,
                      Integer titolsAconseguits,
                      Equip equip) {
        super(nom, dataNaixement, nacionalitat);
        this.dataDebut = dataDebut;
        this.titolsAconseguits = titolsAconseguits;
        this.equip = equip;
    }

    public LocalDate getDataDebut() {
        return dataDebut;
    }

    public void setDataDebut(LocalDate dataDebut) {
        this.dataDebut = dataDebut;
    }

    public Integer getTitolsAconseguits() {
        return titolsAconseguits;
    }

    public void setTitolsAconseguits(Integer titolsAconseguits) {
        this.titolsAconseguits = titolsAconseguits;
    }

    public Equip getEquip() {
        return equip;
    }

    public void setEquip(Equip equip) {
        this.equip = equip;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "dataDebut=" + dataDebut +
                ", titolsAconseguits=" + titolsAconseguits +
                ", equip=" + equip +
                '}';
    }
}
