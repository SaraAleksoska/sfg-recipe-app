package guru.springframework.sfgrecipeproject.repositories;

import guru.springframework.sfgrecipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository<U, L extends Number> extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
