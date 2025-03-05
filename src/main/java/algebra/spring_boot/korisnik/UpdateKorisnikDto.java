package algebra.spring_boot.korisnik;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UpdateKorisnikDto {
    private String ime;
    private String prezime;
    private String email;
    private String password;
    private String oib;
    private LocalDate datumRodenja;
}
