package angelomoreno.Es3_151123.parte1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
}
