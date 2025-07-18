package cosimocrupi.L5.entites;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Prenotazione")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    protected long id;
    @Column(nullable = false)
    protected LocalDate dataEmissione;
    @Column(nullable = false)
    protected LocalDate scadenza;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    protected Utente utente;

    @OneToOne
    @JoinColumn(name = "prenotazione_id", nullable = false, unique = true)
    protected Postazione postazione;
    public Prenotazione(long id, LocalDate dataEmissione, LocalDate scadenza) {
        this.id = id;
        this.dataEmissione = dataEmissione;
        this.scadenza= dataEmissione;
    }
}
