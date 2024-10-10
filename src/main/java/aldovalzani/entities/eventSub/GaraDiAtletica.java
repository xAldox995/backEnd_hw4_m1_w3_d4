package aldovalzani.entities.eventSub;

import aldovalzani.entities.Evento;
import aldovalzani.entities.Persona;
import aldovalzani.entities.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "gare_di_atletica")
public class GaraDiAtletica extends Evento {
    @Column(nullable = false)
    private Set<Persona> atleti;
    @Column(nullable = false)
    private Persona vincitore;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, TipoEvento tipoEvento, int numeroMassimoParticipanti, String descrizione, Set<Persona> atleti, Persona vincitore) {
        super(titolo, tipoEvento, numeroMassimoParticipanti, descrizione);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }
}
