package aldovalzani.entities.eventSub;

import aldovalzani.entities.Evento;
import aldovalzani.entities.Persona;
import aldovalzani.entities.TipoEvento;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "gare")
public class GaraDiAtletica extends Evento {
    @ManyToMany
    @JoinTable(name = "gara_persona", joinColumns = @JoinColumn(name = "gara_id"), inverseJoinColumns = @JoinColumn(name = "persona_id"))
    @Column(nullable = false)
    private Set<Persona> atleti;
    @ManyToOne
    @JoinColumn(name = "vincitore_id")
    private Persona vincitore;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, TipoEvento tipoEvento, int numeroMassimoParticipanti, String descrizione, Set<Persona> atleti, Persona vincitore) {
        super(titolo, tipoEvento, numeroMassimoParticipanti, descrizione);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }
}
