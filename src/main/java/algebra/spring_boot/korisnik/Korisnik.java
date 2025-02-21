package algebra.spring_boot.korisnik;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Korisnik {
    private final Long id;
    private String ime;
    private String prezime;
    private String email;
    private String password;
    private String oib;
    private LocalDate datumRodenja;

    //@AllArgsConstructor
    public Korisnik(Long id, String ime, String prezime, String email, String password, String oib, LocalDate datumRodenja){
        this.id=id;
        this.ime=ime;
        this.prezime=prezime;
        this.email=email;
        this.password=password;
        this.oib=oib;
        this.datumRodenja=datumRodenja;
    }

    public Korisnik(Long id){
        this.id=id;
    }

}
