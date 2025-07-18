package cosimocrupi.L5.repositories;

import cosimocrupi.L5.entites.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
    Utente findByNomeCompleto(String nomeCompleto);
    Utente findByEmail(String Email);
    Utente findByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    void deleteByUsername(String username);
}
