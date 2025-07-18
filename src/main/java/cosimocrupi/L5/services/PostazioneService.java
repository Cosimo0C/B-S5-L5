package cosimocrupi.L5.services;

import cosimocrupi.L5.entites.Postazione;
import cosimocrupi.L5.enums.Tipo;
import cosimocrupi.L5.exceptions.NotFoundException;
import cosimocrupi.L5.exceptions.ValiditaException;
import cosimocrupi.L5.repositories.PostazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;
    public void savePostazione(Postazione newPostaziione){
        if (postazioneRepository.existsById(newPostaziione.getId())) throw new ValiditaException("Postazione già registrata");
        postazioneRepository.save(newPostaziione);
        log.info("Postazione salvata con successo");
    }
    public Optional<Postazione> findById(long id){
        return postazioneRepository.findById(id);
    }
    public List<Postazione> findByTipo (Tipo tipo){
       if (tipo!= null)return postazioneRepository.findByTipo(tipo);
       else throw new NotFoundException("Errore");
    }
    public List<Postazione> findByTipoAndEdificio_Citta(Tipo tipo, String citta){
        List<Postazione> postazioni= postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
        if (postazioni.isEmpty()){System.out.println("Nessuna trovata!");}
        return postazioni;
    }
}
