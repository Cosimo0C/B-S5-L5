package cosimocrupi.L5.repositories;

import cosimocrupi.L5.entites.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
    Optional<Edificio> findById(long id);
    boolean existsById(long id);
    Edificio findByNome(String nome);
    List<Edificio> findByAdress(String indirizzo);
    List<Edificio> findByCity(String citta);

}
