package angelomoreno.Es3_151123.parte3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GradoCheckerFilter extends Filter {
    @Override
    public void doCheck(Ufficiale ufficiale) {
        List<Grado> gradi = Stream.of(Grado.CAPITANO, Grado.MAGGIORE, Grado.TENENTE, Grado.COLONNELLO, Grado.GENERALE).toList();
        int paga = 1000;
        loop:
        for (int i = 0; i < gradi.size(); i++) {
            if (ufficiale.getGrado().equals(gradi.get(i))) {
                ufficiale.setStipendio(paga);
                System.out.println("Il tuo stipendio è: "+ ufficiale.getStipendio());
                if (i!=gradi.size()-1) {
                    System.out.println("Il tuo responsabile è un: " + gradi.get(i+1));
                } else {
                    System.out.println("Sei resposabile dei " + gradi.get(i-1) + " e sottostanti");
                }
                break loop;
            }
            paga += 1000;
        }
        this.goNext(ufficiale);
    }
}
