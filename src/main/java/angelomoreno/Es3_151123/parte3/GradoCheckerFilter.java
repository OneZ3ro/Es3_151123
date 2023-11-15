package angelomoreno.Es3_151123.parte3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GradoCheckerFilter extends Filter {
    @Override
    public void doCheck(Ufficiale ufficiale) {
        List<Grado> gradi = Stream.of(Grado.CAPITANO, Grado.MAGGIORE, Grado.TENENTE, Grado.COLONNELLO, Grado.GENERALE).toList();
        double paga = 1199.99;
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
            paga += 100;
        }
        this.goNext(ufficiale);
//        if (ufficiale.getGrado().equals(Grado.CAPITANO)){
//            ufficiale.setStipendio(1199.99);
//            System.out.println("Il tuo stipendio è: "+ ufficiale.getStipendio());
//            System.out.println("Il tuo responsabile è un: " + Grado.MAGGIORE);
//        } else if (ufficiale.getGrado().equals(Grado.MAGGIORE)){
//            ufficiale.setStipendio(1299.99);
//            System.out.println("Il tuo stipendio è: "+ ufficiale.getStipendio());
//            System.out.println("Il tuo responsabile è un: " + Grado.TENENTE + ". Sei resposabile dei " + Grado.CAPITANO + " e sottostanti");
//        } else if (ufficiale.getGrado().equals(Grado.TENENTE)){
//            ufficiale.setStipendio(1399.99);
//            System.out.println("Il tuo stipendio è: "+ ufficiale.getStipendio());
//            System.out.println("Il tuo responsabile è un: " + Grado.COLONNELLO + ". Sei resposabile dei " + Grado.TENENTE + " e sottostanti");
//        } else if (ufficiale.getGrado().equals(Grado.COLONNELLO)){
//            ufficiale.setStipendio(1499.99);
//            System.out.println("Il tuo stipendio è: "+ ufficiale.getStipendio());
//            System.out.println("Il tuo responsabile è un: " + Grado.GENERALE + ". Sei resposabile dei " + Grado.COLONNELLO + " e sottostanti");
//        } else if (ufficiale.getGrado().equals(Grado.GENERALE)){
//            ufficiale.setStipendio(1599.99);
//            System.out.println("Il tuo stipendio è: "+ ufficiale.getStipendio());
//            System.out.println("Sei resposabile dei " + Grado.COLONNELLO + " e sottostanti");
//        }
    }
}
