package cosimocrupi.L5.repositories;

import cosimocrupi.L5.entites.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    Optional<Prenotazione> findById(long id);
    Prenotazione findByDate(LocalDate dataEmissione);
    boolean existsById(long prenId);
}
