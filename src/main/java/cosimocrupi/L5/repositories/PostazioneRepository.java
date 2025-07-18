package cosimocrupi.L5.repositories;

import cosimocrupi.L5.entites.Postazione;
import cosimocrupi.L5.enums.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    Optional<Postazione> findById(long id);
    boolean existsById(long id);
    List<Postazione> findByTipo(Tipo tipo);
    List<Postazione> findByLibera(boolean isLibera);
}
