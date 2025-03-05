package algebra.spring_boot.category;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CreateCategoryDto {
    @NotBlank
    private String name;

    private String description;

    public void category(String name, String description){
        this.name=name;
        this.description=description;
    }
}
