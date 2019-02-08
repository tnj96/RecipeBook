package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.RecipeRepository;

public class RecipeServiceImpl implements RecipeService {

	@Inject
	private RecipeRepository repo;
	
	public void setRepo(RecipeRepository repo) {
		this.repo = repo;
	}

	@Override
	public String addRecipe(String recipeName) {
		if(recipeName.contains("Bacon"))
		{
			return "Can't Add This Recipe";
		}
		return repo.createRecipe(recipeName);
	}

	public String getAllRecipes() {
		return repo.getAllRecipes();
	}

	@Override
	public String getARecipe(Long id) {
		
		return repo.getARecipe(id);
	}

	@Override
	public String updateRecipe(String recipeName, Long id) {
		return repo.updateRecipe(recipeName, id);
	}

	@Override
	public String deleteRecipe(Long id) {
		
		return repo.deleteRecipe(id);
	}

	@Override
	public int cycleRecipes(String recipeName) {
		
		return repo.cycleRecipes(recipeName);
	}

}
