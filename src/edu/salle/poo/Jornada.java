package edu.salle.poo;

import java.util.Arrays;

public class Jornada {

    private String[] dies;
    private Temporada temporada;
    private Jornada jornada;

    public Jornada(String[] dies, Temporada temporada, Jornada jornada) {
        this.dies = dies;
        this.temporada = temporada;
        this.jornada = jornada;
    }

    public String[] getDies() {
        return dies;
    }

    public void setDies(String[] dies) {
        this.dies = dies;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Jornada{" +
                "dies=" + Arrays.toString(dies) +
                ", jornada=" + jornada +
                '}';
    }
}
