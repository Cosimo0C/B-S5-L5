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

    public Prenotazione(long id, LocalDate dataEmissione) {
        this.id = id;
        this.dataEmissione = dataEmissione;
    }
}
