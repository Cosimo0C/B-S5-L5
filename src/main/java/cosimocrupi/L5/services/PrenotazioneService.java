package cosimocrupi.L5.services;

import cosimocrupi.L5.entites.Prenotazione;
import cosimocrupi.L5.exceptions.ValiditaException;
import cosimocrupi.L5.repositories.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    public void saveNewPrenotazione(Prenotazione newPrenotazione){
        if (prenotazioneRepository.existsById(newPrenotazione.getId())) throw new ValiditaException("Prenotazione già esistente");
        prenotazioneRepository.save(newPrenotazione);
        log.info("Prenotazione salvata correttamente");
    }
    public Optional<Prenotazione> findById(long id){
        return prenotazioneRepository.findById(id);
    }
    public Prenotazione findByDataEmissione(LocalDate dataEmissione){
        return prenotazioneRepository.findByDataEmissione(dataEmissione);
    }
}
