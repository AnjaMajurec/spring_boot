package algebra.spring_boot.book;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String author;
    private Integer yearPublished;
    private Double price;

    public Book(Long id){
        this.id=id;
    }
}
