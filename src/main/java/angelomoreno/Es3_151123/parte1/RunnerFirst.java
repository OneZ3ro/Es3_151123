package angelomoreno.Es3_151123.parte1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class RunnerFirst implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("Francesco", "Rossi", LocalDate.parse("2002-01-01"));
        UserData userData = new UserData();
        Adapter adapter = new Adapter(info);

        userData.getData(adapter);
        System.out.println("userData: nome completo= " + userData.getNomeCompleto());
        System.out.println("userData: anno di nascita= " + userData.getEta());
    }
}
