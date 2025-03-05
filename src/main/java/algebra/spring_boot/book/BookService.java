package algebra.spring_boot.book;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    public Book create(CreateBookDto dto){
        return new Book(1l,dto.getTitle(),dto.getAuthor(), dto.getYearPublished(), dto.getPrice());
    }

    public Book update(Long id, UpdateBookDto dto) {
        Book bookFromDb = new Book(id);
        bookFromDb.setTitle(dto.getTitle());
        bookFromDb.setAuthor(dto.getAuthor());
        bookFromDb.setYearPublished(dto.getYearPublished());
        bookFromDb.setPrice(dto.getPrice());
        return bookFromDb;
    }

    public Book findById(Long id) {
        return new Book(id, "Potresi", "Hrvoje Tkalčić", 2020, 29.99);
    }

    public List<Book> fetchAll(){
        return List.of(new Book(2l, "Tisuću žarkih sunaca","Khaleid Hosseini",2007,30.00), new Book(3l,"Zločin i kazna", "Dostojevski",1950,40.32));
    }

    public void delete(Long id){
        System.out.println("Book ID: "+id+" DELETE.");
    }
}
