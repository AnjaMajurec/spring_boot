package algebra.spring_boot.category;

import algebra.spring_boot.article.Article;
import algebra.spring_boot.article.ArticleRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    private final JdbcTemplate jdbcTemplate;

    public Optional<Category> findById(Integer id){
        String query="SELECT * FROM Category WHERE id=?";
        return Optional.of(jdbcTemplate.queryForObject(query,new CategoryRowMapper(),id));
    }
    public List<Category> fetchAll(){
        return jdbcTemplate.query("SELECT c.id, c.name, c.description FROM Category c", new CategoryRowMapper());
    }
    public Category create(Category category){
        String query="INSERT INTO Category (name, description) VALUES (?,?)";
        jdbcTemplate.update(query,category.getName(),category.getDescription());
        return category;
    }

    public Category update(Category category){
        String query="UPDATE Category SET name=?, description=? WHERE id=?";
        jdbcTemplate.update(query,category.getName(),category.getDescription(),category.getId());
        return category;
    }

}