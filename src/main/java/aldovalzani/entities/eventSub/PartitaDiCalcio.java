package aldovalzani.entities.eventSub;

import aldovalzani.entities.Evento;
import aldovalzani.entities.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "partite_di_calcio")
public class PartitaDiCalcio extends Evento {
    @Column(name = "squadra_di_casa", nullable = false)
    private String squadraDiCasa;
    @Column(name = "squadra_ospite", nullable = false)
    private String squadraOspite;
    @Column(name = "squadra_vincente")
    private String squadraVincente; /*deve essere null se è pareggio*/
    @Column(name = "gol_squadra_di_casa", nullable = false)
    private int golSquadraDiCasa;
    @Column(name = "gol_squadra_ospite", nullable = false)
    private int golSquadraOspite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, TipoEvento tipoEvento, int numeroMassimoParticipanti, String descrizione, int golSquadraDiCasa, int golSquadraOspite, String squadraDiCasa, String squadraOspite, String squadraVincente) {
        super(titolo, tipoEvento, numeroMassimoParticipanti, descrizione);
        this.golSquadraDiCasa = golSquadraDiCasa;
        this.golSquadraOspite = golSquadraOspite;
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
    }
}
