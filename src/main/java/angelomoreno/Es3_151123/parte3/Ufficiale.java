package angelomoreno.Es3_151123.parte3;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ufficiale {
    private Grado grado;
    private double stipendio;
    public Ufficiale(Grado grado) {
        this.grado = grado;
    }
}
