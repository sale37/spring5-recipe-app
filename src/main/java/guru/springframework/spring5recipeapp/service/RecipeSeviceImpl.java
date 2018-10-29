package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.model.Recipe;
import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeSeviceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeSeviceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recepieSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recepieSet::add);
        return recepieSet;
    }
}
