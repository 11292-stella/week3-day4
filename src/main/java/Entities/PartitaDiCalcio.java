package Entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento{

    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int numeroGolDiCasa;
    private int numeroGolOspite;

    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente, int numeroGolDiCasa, int numeroGolOspite) {
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolDiCasa = numeroGolDiCasa;
        this.numeroGolOspite = numeroGolOspite;
    }

    public PartitaDiCalcio(String titolo, LocalDate data, String descrizione, String squadraDiCasa, String squadraOspite, String squadraVincente, int numeroGolDiCasa, int numeroGolOspite) {
        super(titolo, data, descrizione);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = calcolaVincente();
        this.numeroGolDiCasa = numeroGolDiCasa;
        this.numeroGolOspite = numeroGolOspite;

    }

    private String calcolaVincente(){
        if (numeroGolDiCasa > numeroGolOspite) {
            return squadraDiCasa;

        } else if (numeroGolOspite > numeroGolDiCasa) {
            return squadraOspite;

        } else {
            return null;
        }
    }

    public PartitaDiCalcio(){}

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumeroGolDiCasa() {
        return numeroGolDiCasa;
    }

    public void setNumeroGolDiCasa(int numeroGolDiCasa) {
        this.numeroGolDiCasa = numeroGolDiCasa;
        this.squadraVincente = calcolaVincente();
    }

    public int getNumeroGolOspite() {
        return numeroGolOspite;
    }

    public void setNumeroGolOspite(int numeroGolOspite) {
        this.numeroGolOspite = numeroGolOspite;
        this.squadraVincente = calcolaVincente();
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeroGolDiCasa=" + numeroGolDiCasa +
                ", numeroGolOspite=" + numeroGolOspite +
                '}';
    }
}
