package com.qa.persistence.repository;

public interface RecipeRepository 
{
	//C
	String createRecipe(String recipeName);
	
	//R
	String getAllRecipes();
	
	String getARecipe(Long id);
	
	//U
	String updateRecipe(String recipeName, Long id);

	//D
	String deleteRecipe(Long id);
	
	int cycleRecipes(String recipeName);
}
