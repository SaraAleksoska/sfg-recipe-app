package guru.springframework.sfgrecipeproject.repositories;

import guru.springframework.sfgrecipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CategoryRepository<UnitOfMeasure, Long>{

    Optional<UnitOfMeasure> findByDescriptionn (String uom);

}
