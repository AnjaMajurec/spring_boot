package algebra.spring_boot.korisnik;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class KorisnikService {

    public Korisnik create(CreateKorisnikDto dto){
        return new Korisnik(1l,dto.getIme(), dto.getPrezime(), dto.getEmail(), dto.getPassword(), dto.getOib(), dto.getDatumRodenja());

    }
    public Korisnik update(Long id, UpdateKorisnikDto dto){
        Korisnik korisnikFromDb=new Korisnik(id);
        korisnikFromDb.setIme(dto.getIme());
        korisnikFromDb.setPrezime(dto.getPrezime());
        korisnikFromDb.setEmail(dto.getEmail());
        korisnikFromDb.setPassword(dto.getPassword());
        korisnikFromDb.setOib(dto.getOib());
        korisnikFromDb.setDatumRodenja(dto.getDatumRodenja());
        return korisnikFromDb;
    }

    public Korisnik findById(Long id){
        return new Korisnik(id, "Anja", "Majurec","amajurec@gmail.com","anjaMajurec123", "02112354371", LocalDate.of(1998,7,27));
    }

    public List<Korisnik> fetchAll(){
        return List.of(new Korisnik(1l,"Iva", "Foret", "iforet@gmail.com","ivaForet123", "43276598735", LocalDate.of(1998,4,26)),new Korisnik(2l,"Lara","Mandić","lmandic@gmail.com","laraMandic321", "65423498745",LocalDate.of(1998,8,19)));
    }

    public void delete(Long id){
        System.out.println("Korisnik s id-jem:"+id+" se briše iz baze");
    }




}
