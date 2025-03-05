package algebra.spring_boot.book;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Book book=bookService.findById(id);
        return ResponseEntity.ok(book);
    }

    @GetMapping()
    public ResponseEntity<List<Book>> fetchAll(){
        List<Book> books=bookService.fetchAll();
        return ResponseEntity.ok(books);
    }

    @PostMapping()
    public ResponseEntity<Book> create(@Valid @RequestBody CreateBookDto dto){
        Book book=bookService.create(dto);
        return ResponseEntity.status(201).body(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@Valid @RequestBody UpdateBookDto dto, @PathVariable Long id){
        Book book=bookService.update(id,dto);
        return ResponseEntity.status(200).body(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        bookService.delete(id);
        return ResponseEntity.status(204).build();
    }

}
