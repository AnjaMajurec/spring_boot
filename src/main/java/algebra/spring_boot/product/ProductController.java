package algebra.spring_boot.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public Product findbyId(@PathVariable Long id){
        return productService.findbyId(id);
    }

    @GetMapping()
    public List<Product> fetchAll(){
        return productService.fetchAll();
    }

    @PostMapping
    public Product create(@RequestBody CreateProductDto dto){
        return productService.createProduct(dto);
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody UpdateProductDto dto,@PathVariable Long id){
        return productService.updateProduct(id, dto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productService.deleteProduct(id);

    }







}
