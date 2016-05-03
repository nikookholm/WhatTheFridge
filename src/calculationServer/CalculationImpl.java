package calculationServer;

import ingredientServer.Ingredient;
import ingredientServer.IngredientServer;
import ingredientServer.iIngredientServer;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


import recipeServer.Recipe;

public class CalculationImpl implements iCalculation {

	
	public CalculationImpl(){
		URL url = null;
		
		try {
			url = new URL("http://localhost:1337/ingredientserver?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		QName qname = new QName("http://ingredientServer/", "IngredientServerService");
		Service service = Service.create(url, qname);
		IngredientServer is = service.getPort(IngredientServer.class);
	}

	Recipe recipe;
	ArrayList<Recipe> allRecipes;

	Ingredient ingredient;
	ArrayList<Ingredient> allIngredients;

	public boolean userLogin(String user, String password) {

		return false;
	}
	
	public String testConnection(){
		return "Connected";
	}

	public Ingredient getIngredient(int ID) {
		
		return ingredient;
	}

	public Recipe getRecipe(int ID) {
		return recipe;
	}

	public ArrayList<Recipe> getAllRecipes() {
		return allRecipes;
	}

	public ArrayList<Ingredient> getAllIngredients() {
		return allIngredients;
	}

	public ArrayList<Recipe> getPossibleRecipes(ArrayList<Integer> ID) {
		ArrayList<Recipe> possibleRecipes = new ArrayList<>();
		return possibleRecipes;
	}

	public ArrayList<Recipe> WhatAmIMissing(Recipe recipe) {
		ArrayList<Recipe> shitIsMissing = new ArrayList<>();
		return shitIsMissing;

	}

}
