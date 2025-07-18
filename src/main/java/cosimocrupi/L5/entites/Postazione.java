package cosimocrupi.L5.entites;

import cosimocrupi.L5.enums.Tipo;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Postazione")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    protected long id;
    @Column(nullable = false)
    protected String descrizione;
    @Column(nullable = false)
    protected Tipo tipo;
    @Column(nullable = false)
    protected int maxOccupanti;
    @Column(nullable = false)
    protected boolean isLibera;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    protected Edificio edificio;

    @OneToOne(mappedBy = "postazione")
    protected Prenotazione prenotazione;

    public Postazione(long id, String descrizione, Tipo tipo, int maxOccupanti, boolean isLibera) {
        this.id = id;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.maxOccupanti = maxOccupanti;
        this.isLibera = isLibera;
    }
}
