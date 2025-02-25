package algebra.spring_boot.book;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpdateBookDto {

    @Size(min = 3)
    private String title;

    private String author;

    @Min(value = 1500)
    @Max(value = 2025)
    private int yearPublished;

    @Positive
    private double price;

}

