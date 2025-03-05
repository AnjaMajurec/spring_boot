package algebra.spring_boot.book;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateBookDto {

    @NotBlank
    @Size(min = 3)
    private String title;

    @NotBlank()
    private String author;

    @Min(value = 1500)
    @Max(value = 2025)
    private int yearPublished;

    @Positive
    private double price;
}