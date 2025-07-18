package cosimocrupi.L5.runners;

import cosimocrupi.L5.entites.Postazione;
import cosimocrupi.L5.enums.Tipo;
import cosimocrupi.L5.services.PostazioneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PostazioneRunner implements CommandLineRunner {
    @Autowired
    private PostazioneService postazioneService;
    @Override
    public void run(String... args) throws Exception {
        Postazione p1= new Postazione("Excel officer", Tipo.PRIVATO, 10, true);
        postazioneService.savePostazione(p1);
    }
}
