package com.qa.business.service;

public interface RecipeService {
	
	//C
	String addRecipe(String recipeName);
	
	//R
	String getAllRecipes();
	
	String getARecipe(Long id);
	
	//U
	String updateRecipe(String recipeName, Long id);

	//D
	String deleteRecipe(Long id);
	
	int cycleRecipes(String recipeName);

}
