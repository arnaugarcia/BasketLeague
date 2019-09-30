package edu.salle.poo;

import java.util.List;

public class Partit {

    private List<Part> parts;
    private List<Jornada> jornadas;
    private List<Equip> equips;

    public Partit(List<Part> parts, List<Jornada> jornadas, List<Equip> equips) {
        this.parts = parts;
        this.jornadas = jornadas;
        this.equips = equips;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public List<Equip> getEquips() {
        return equips;
    }

    public void setEquips(List<Equip> equips) {
        this.equips = equips;
    }

    @Override
    public String toString() {
        return "Partit{" +
                "parts=" + parts +
                ", jornadas=" + jornadas +
                ", equips=" + equips +
                '}';
    }
}
