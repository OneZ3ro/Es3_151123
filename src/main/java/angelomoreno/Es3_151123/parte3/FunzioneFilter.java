package angelomoreno.Es3_151123.parte3;

import java.util.List;
import java.util.stream.Stream;

public class FunzioneFilter extends Filter{
    @Override
    public void doCheck(Ufficiale ufficiale) {
        switch (ufficiale.getGrado()) {
            case CAPITANO -> System.out.println("Funzione saluto del capitano");
            case MAGGIORE -> System.out.println("Funzione saluto del maggiore");
            case TENENTE -> System.out.println("Funzione saluto del tenente");
            case COLONNELLO -> System.out.println("Funzione saluto del colonello");
            case GENERALE -> System.out.println("Funzine saluto del generale");
        }
        this.goNext(ufficiale);
    }
}
