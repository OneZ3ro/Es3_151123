package angelomoreno.Es3_151123.parte1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
