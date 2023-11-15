package angelomoreno.Es3_151123.parte3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Ufficiale ufficiale = new Ufficiale(Grado.MAGGIORE);
        GradoCheckerFilter gradoCheckerFilter = new GradoCheckerFilter();
        FunzioneFilter funzioneFilter = new FunzioneFilter();

        gradoCheckerFilter.setNext(funzioneFilter);
        gradoCheckerFilter.doCheck(ufficiale);
    }
}
