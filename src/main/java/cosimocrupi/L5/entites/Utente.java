package cosimocrupi.L5.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Utente")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Utente {
    @Id
    @Setter(AccessLevel.NONE)
    protected String id;
    @Column(nullable = false)
    protected String nomeCompleto;
    @Column(nullable = false)
    protected String email;

    public Utente(String id, String nomeCompleto, String email) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
}
