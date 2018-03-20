package guru.springframework.controllers;

import guru.springframework.repositories.RecipeRepository;
import guru.springframework.services.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;

public class IndexControllerTest {

    RecipeServiceImpl recipeService;
    IndexController indexController;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {
        assertEquals(indexController.getIndexPage(model),"index");

    }
}