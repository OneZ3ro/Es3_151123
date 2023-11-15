package angelomoreno.Es3_151123.parte3;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ImportoFilter extends Filter{
    @Override
    public void doCheck(Ufficiale ufficiale) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un importo per verificare a quale grado appartieni");
        int importo = Integer.parseInt(scanner.nextLine());
        List<Integer> paghe = Stream.of(1000, 2000, 3000, 4000, 5000).toList();
        List<Grado> gradi = Stream.of(Grado.CAPITANO, Grado.MAGGIORE, Grado.TENENTE, Grado.COLONNELLO, Grado.GENERALE).toList();
        loop:
        for (int i = paghe.size()-1; i >= 0; i--) {
            if (importo >= paghe.get(i)) {
                System.out.println("Appartieni al grado: " + gradi.get(i));
                break loop;
            }
        }
        scanner.close();
        this.goNext(ufficiale);
    }
}
