package edu.salle.poo;

import java.util.List;

public class Temporada {

    private Integer any;
    private Integer minutsJugats;
    private List<Jornada> jornadas;

    public Temporada(Integer any, Integer minutsJugats, List<Jornada> jornadas) {
        this.any = any;
        this.minutsJugats = minutsJugats;
        this.jornadas = jornadas;
    }

    public Integer getAny() {
        return any;
    }

    public void setAny(Integer any) {
        this.any = any;
    }

    public Integer getMinutsJugats() {
        return minutsJugats;
    }

    public void setMinutsJugats(Integer minutsJugats) {
        this.minutsJugats = minutsJugats;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "any=" + any +
                ", minutsJugats=" + minutsJugats +
                ", jornadas=" + jornadas +
                '}';
    }
}

