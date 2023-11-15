package angelomoreno.Es3_151123.parte3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Ufficiale ufficiale = new Ufficiale(Grado.GENERALE);
        GradoCheckerFilter gradoCheckerFilter = new GradoCheckerFilter();
        FunzioneFilter funzioneFilter = new FunzioneFilter();
        ImportoFilter importoFilter = new ImportoFilter();

        gradoCheckerFilter.setNext(funzioneFilter);
        funzioneFilter.setNext(importoFilter);
        gradoCheckerFilter.doCheck(ufficiale);
    }
}
