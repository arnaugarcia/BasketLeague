package edu.salle.poo;

import java.time.LocalDate;

public class Part {

    private LocalDate horaInici;
    private LocalDate horaFi;
    private Integer puntsEquipLocal;
    private Integer puntsEquipVisitant;
    private Partit partit;

    public Part(LocalDate horaInici,
                LocalDate horaFi,
                Integer puntsEquipLocal,
                Integer puntsEquipVisitant,
                Partit partit) {
        this.horaInici = horaInici;
        this.horaFi = horaFi;
        this.puntsEquipLocal = puntsEquipLocal;
        this.puntsEquipVisitant = puntsEquipVisitant;
        this.partit = partit;
    }

    public LocalDate getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(LocalDate horaInici) {
        this.horaInici = horaInici;
    }

    public LocalDate getHoraFi() {
        return horaFi;
    }

    public void setHoraFi(LocalDate horaFi) {
        this.horaFi = horaFi;
    }

    public Integer getPuntsEquipLocal() {
        return puntsEquipLocal;
    }

    public void setPuntsEquipLocal(Integer puntsEquipLocal) {
        this.puntsEquipLocal = puntsEquipLocal;
    }

    public Integer getPuntsEquipVisitant() {
        return puntsEquipVisitant;
    }

    public void setPuntsEquipVisitant(Integer puntsEquipVisitant) {
        this.puntsEquipVisitant = puntsEquipVisitant;
    }

    public Partit getPartit() {
        return partit;
    }

    public void setPartit(Partit partit) {
        this.partit = partit;
    }

    @Override
    public String toString() {
        return "Part{" +
                "horaInici=" + horaInici +
                ", horaFi=" + horaFi +
                ", puntsEquipLocal=" + puntsEquipLocal +
                ", puntsEquipVisitant=" + puntsEquipVisitant +
                ", partit=" + partit +
                '}';
    }
}
