package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity


public class GaraDiAtletica extends Evento {

   @ManyToMany
   @JoinTable(name = "gara_atleti",
   joinColumns = @JoinColumn(name = "gara_id"),
   inverseJoinColumns = @JoinColumn(name = "persona_id"))
   private List<Persona> atleti;

   @ManyToOne
   private Persona vincitore;

    public GaraDiAtletica(List<Persona> atleti, Persona vincitore) {
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica(String titolo, LocalDate data, String descrizione, List<Persona> atleti, Persona vincitore) {
        super(titolo, data, descrizione);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica(){}

    public List<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(List<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}' + super.toString();
    }
}
