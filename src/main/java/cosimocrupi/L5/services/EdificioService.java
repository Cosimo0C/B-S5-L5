package cosimocrupi.L5.services;

import cosimocrupi.L5.entites.Edificio;
import cosimocrupi.L5.exceptions.NotFoundException;
import cosimocrupi.L5.exceptions.ValiditaException;
import cosimocrupi.L5.repositories.EdificioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;
    public void saveEdificio(Edificio newEdificio){
        if (edificioRepository.existsById(newEdificio.getId())) throw new ValiditaException("L'edificio esiste già");
        edificioRepository.save(newEdificio);
        log.info("Edificio salvato correttamente");
    }
    public Optional<Edificio> findById(long id){
        return edificioRepository.findById(id);
    }
    public Edificio findByNome(String nome){
        if (nome != null) return edificioRepository.findByNome(nome);
        else throw new NotFoundException("Errore");
    }
    public List<Edificio> findByIndirizzo(String indirizzo){
        if (indirizzo!= null ) return edificioRepository.findByIndirizzo(indirizzo);
        else throw new NotFoundException("Errore");
    }
    public List<Edificio> findByCitta(String citta){
        if (citta!= null) return edificioRepository.findByCitta(citta);
        else throw new NotFoundException("Errore");
    }
}
