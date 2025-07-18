package cosimocrupi.L5.services;

import cosimocrupi.L5.entites.Utente;
import cosimocrupi.L5.exceptions.NotFoundException;
import cosimocrupi.L5.exceptions.ValiditaException;
import cosimocrupi.L5.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;
    public void saveUtente(Utente newUtente){
        if (utenteRepository.existsByEmail(newUtente.getEmail())) throw new ValiditaException("Email"+ newUtente.getEmail() + "già in uso");
        if (utenteRepository.existsByUsername(newUtente.getUsername())) throw new ValiditaException("Username" + newUtente.getUsername()+ "già in uso");
        if (newUtente.getNomeCompleto().length()<4) throw new ValiditaException("Il nome completo non può essere più corto di 4 caratteri");
        utenteRepository.save(newUtente);
        log.info("L'utente " + newUtente.getNomeCompleto() + "è stato salvato correttamente");
    }
    public Utente findByNomeCompleto(String nomeCompleto){
      return this.utenteRepository.findByNomeCompleto(nomeCompleto);
    }
    public Utente findByUsername(String username){
        if (username!=null) return utenteRepository.findByUsername(username);
        else throw new NotFoundException("Errore");
    }
    public Utente findByEmail(String email){
     if (email!= null) return utenteRepository.findByEmail(email);
     else throw new NotFoundException("Errore null");
    }
    public void deleteByUsername(String username){
        Utente fnd= this.findByUsername(username);
        utenteRepository.delete(fnd);
        log.info("L'utente con username" + username + " è stato cancellato correttamente!");
    }
}
