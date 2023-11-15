package angelomoreno.Es3_151123.parte1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Adapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate oggi = LocalDate.now();
        int annoOggi = oggi.getYear();
        int annoNascita = info.getDataDiNascita().getYear();
        return annoOggi - annoNascita;
    }

}
