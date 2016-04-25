package calculationServer;

import ingredientServer.Ingredient;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import recipeServer.Recipe;

public class CalculationImpl extends UnicastRemoteObject implements iCalculation {

	public CalculationImpl() throws java.rmi.RemoteException{
		
	}
	
	Recipe recipe;
	ArrayList<Recipe> allRecipes;
	
	Ingredient ingredient;
	ArrayList<Ingredient> allIngredients;
	
	public Ingredient getIngredient(int ID){
		return ingredient;
	}
	
	public Recipe getRecipe(int ID){
		return recipe;
	}
	
	public ArrayList<Recipe> getAllRecipes(){
		return allRecipes;
	}
	
	public ArrayList<Ingredient> getAllIngredients(){
		return allIngredients;
	}
	
	public ArrayList<Recipe> getPossibleRecipes(ArrayList<Integer> ID){
		ArrayList<Recipe> possibleRecipes = new ArrayList<>();
		return possibleRecipes;
	}
	
	public ArrayList<Recipe> WhatAmIMissing(Recipe recipe){
		ArrayList<Recipe> shitIsMissing = new ArrayList<>();
		return shitIsMissing;
		
	}

}
