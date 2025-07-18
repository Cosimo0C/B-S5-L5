package cosimocrupi.L5.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "utente")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Utente {
    @Id
    @Setter(AccessLevel.NONE)
    protected String username;
    @Column(nullable = false)
    protected String nomeCompleto;
    @Column(nullable = false)
    protected String email;

    @OneToMany(mappedBy = "utente")
    protected List<Prenotazione> prenotazioni;
    public Utente(String username, String nomeCompleto, String email) {
        this.username =username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public String setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return nomeCompleto;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }
}
