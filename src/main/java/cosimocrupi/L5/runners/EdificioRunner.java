package cosimocrupi.L5.runners;

import cosimocrupi.L5.entites.Edificio;
import cosimocrupi.L5.services.EdificioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EdificioRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Override
    public void run(String... args) throws Exception {
        Edificio e1=new Edificio("C tower", "via delle americhe", "Roma");
        edificioService.saveEdificio(e1);
    }
}
