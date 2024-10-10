package aldovalzani.entities.eventSub;

import aldovalzani.entities.Evento;
import aldovalzani.entities.TipoEvento;
import jakarta.persistence.*;

@Entity
@Table(name = "concerti")
public class Concerto extends Evento {
    @Column(nullable = false)
    boolean streaming;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GenereConcerto genere;

    public Concerto() {
    }

    public Concerto(String titolo, TipoEvento tipoEvento, int numeroMassimoParticipanti, String descrizione, GenereConcerto genere, boolean streaming) {
        super(titolo, tipoEvento, numeroMassimoParticipanti, descrizione);
        this.genere = genere;
        this.streaming = streaming;
    }
}
