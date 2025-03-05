package algebra.spring_boot.korisnik;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/korisnici")
@RequiredArgsConstructor
public class KorisnikController {

    private final KorisnikService korisnikService;

    @GetMapping()
    public List<Korisnik> fetchAll(){
        return korisnikService.fetchAll();
    }

    @GetMapping("/{id}")
    public Korisnik findById(@PathVariable Long id){
        return korisnikService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        korisnikService.delete(id);
    }

    @PostMapping()
    public Korisnik create(@RequestBody CreateKorisnikDto dto){
        return korisnikService.create(dto);
    }

    @PutMapping("/{id}")
    public Korisnik update(@PathVariable Long id, @RequestBody UpdateKorisnikDto dto){
        return korisnikService.update(id, dto);
    }

}
