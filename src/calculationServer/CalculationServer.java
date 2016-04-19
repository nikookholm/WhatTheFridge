package calculationServer;

import ingredientServer.Ingredient;

import java.util.ArrayList;

import recipeServer.Recipe;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class CalculationServer {
	Firebase rootRef;
	
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
