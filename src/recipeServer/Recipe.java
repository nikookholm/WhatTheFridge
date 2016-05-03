package recipeServer;

import ingredientServer.Ingredient;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recipe {

	private int ID;
	private String name;
	private ArrayList<Ingredient> ingredients;
	private String description;
	
	public Recipe(int id, String name, ArrayList<Ingredient> ingredients, String description)
	{
		
	}
	
	public int getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	
}
