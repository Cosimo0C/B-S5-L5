package cosimocrupi.L5.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "edificio")
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

    @OneToMany(mappedBy = "edificio")
    protected List<Postazione> postazioni;

    public Edificio(String nome, String indirizzo, String citta) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }
}
