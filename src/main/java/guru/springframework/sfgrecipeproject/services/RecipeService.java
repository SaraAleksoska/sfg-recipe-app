package guru.springframework.sfgrecipeproject.services;

import guru.springframework.sfgrecipeproject.commands.RecipeCommand;
import guru.springframework.sfgrecipeproject.domain.Recipe;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;
import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipies();
    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    void deleteById(Long idToDelete);
}
