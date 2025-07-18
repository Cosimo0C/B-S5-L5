package cosimocrupi.L5.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Edificio")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    protected long id;
    @Column(nullable = false)
    protected String nome;
    @Column(nullable = false)
    protected String indirizzo;
    @Column(nullable = false)
    protected String citta;

    @OneToMany(mappedBy = "edificio_id")
    protected List<Postazione> postazioni;

    public Edificio(long id, String nome, String indirizzo, String citta) {
        this.id = id;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }
}
