package cosimocrupi.L5.runners;

import cosimocrupi.L5.entites.Prenotazione;
import cosimocrupi.L5.services.PrenotazioneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class PrenotazioneRunner implements CommandLineRunner {
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Override
    public void run(String... args) throws Exception {
        LocalDate today= LocalDate.now();
        Prenotazione pp1= new Prenotazione(today, today);
        prenotazioneService.savePrenotazione(pp1);
    }
}
