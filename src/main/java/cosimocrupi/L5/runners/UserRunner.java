package cosimocrupi.L5.runners;

import cosimocrupi.L5.entites.Utente;
import cosimocrupi.L5.services.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserRunner implements CommandLineRunner {
    @Autowired
    private UtenteService utenteService;
    @Override
    public void run(String... args) throws Exception {
        Utente u1= new Utente("Cosk", "Cosimo Crupi", "csoimocrupi01@gmail.com");
        //utenteService.saveUtente(u1);
    }
}
