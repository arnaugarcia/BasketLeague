package edu.salle.poo;

import java.time.LocalDate;

public class Equip {

    private String nom;
    private LocalDate dataFundacio;
    private String localitat;
    private Entrenador entrenador;

    public Equip(String nom,
                 LocalDate dataFundacio,
                 String localitat,
                 Entrenador entrenador) {
        this.nom = nom;
        this.dataFundacio = dataFundacio;
        this.localitat = localitat;
        this.entrenador = entrenador;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDataFundacio() {
        return dataFundacio;
    }

    public void setDataFundacio(LocalDate dataFundacio) {
        this.dataFundacio = dataFundacio;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Equip{" +
                "nom='" + nom + '\'' +
                ", dataFundacio=" + dataFundacio +
                ", localitat='" + localitat + '\'' +
                ", entrenador=" + entrenador +
                '}';
    }
}
