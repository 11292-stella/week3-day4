package Entities;

import Enumerated.Genere;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Concerto extends Evento{

    private Genere genere;
    private boolean inStreaming;

    public Concerto(Genere genere, boolean inStreaming) {
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto(String titolo, LocalDate data, String descrizione, Genere genere, boolean inStreaming) {
        super(titolo, data, descrizione);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto(){}

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                '}' + super.toString();
    }
}
