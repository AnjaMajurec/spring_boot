package algebra.spring_boot.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public Product createProduct(CreateProductDto dto){
        return new Product(12l, dto.getName());
    }

    public Product updateProduct(Long id, UpdateProductDto dto){
        Product productFromDb=new Product(id,"old name");
        productFromDb.setName(dto.getName());
        return productFromDb;
    }
    public Product findbyId(Long id){
        return new Product(id,"some name from db");
    }
    public List<Product> fetchAll(){
        return List.of(new Product(12l, "Mobitel"), new Product(15l, "Klima uredaj"));
    }
    public void deleteProduct(Long id){
        System.out.println("Product se briše iz baze podataka, id: "+id);
      //logika za brisanje
    }

}
