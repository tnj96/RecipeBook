package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.RecipeService;

@Path("/recipe")
public class RecipeEndpoint {

	@Inject 
	private RecipeService service;

	public void setService(RecipeService service) {
		this.service = service;
	}
	
	
	@Path("/createRecipe")
	@GET
	@Produces({"application/json"})
	public String addRecipe(String recipeName) {
		return service.addRecipe(recipeName);
		
	}
	
	@Path("/getAllRecipes")
	@GET
	@Produces({"application/json"})
	public String getAllRecipes() {
		return service.getAllRecipes();
	}
	
	@Path("/getARecipe/{id}")
	@GET
	@Produces({"application/json"})
	public String getARecipe(@PathParam("id") Long id) {
		return service.getARecipe(id);
	}

	@Path("/deleteRecipe/{id}")
	@GET
	@Produces({"application/json"})
	public String deleteRecipe(@PathParam("id") Long id) {
		return service.deleteRecipe(id);
	}
	
	@Path("/cycleRecipes/{recipeName}")
	@GET
	@Produces({"application/json"})
	public int cycleRecipes(@PathParam("recipeName") String recipeName) {
		return service.cycleRecipes(recipeName);
	}
	
		
}
