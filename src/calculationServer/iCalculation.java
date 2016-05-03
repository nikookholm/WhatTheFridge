package calculationServer;

import recipeServer.Recipe;

import java.util.ArrayList;

import ingredientServer.Ingredient;

interface iCalculation{

	public boolean userLogin(String user, String password);
	public Ingredient getIngredient(int ID);
	public Recipe getRecipe(int ID);
	public ArrayList<Recipe> getAllRecipes();
	public ArrayList<Ingredient> getAllIngredients();
	public ArrayList<Recipe> getPossibleRecipes(ArrayList<Integer> ID);
	public ArrayList<Recipe> WhatAmIMissing(Recipe recipe);
}
