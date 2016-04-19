package recipeServer;

import ingredientServer.Ingredient;

import java.util.ArrayList;

import javax.xml.ws.Endpoint;

public class RecipeServer implements iRecipeServer {
		
	public RecipeServer(){
		init();
	}

	public void init(){
		Endpoint.publish("localhost:4545", this);
	}

	@Override
	public ArrayList<Ingredient> getAllRecipes() {
		return null;
		
	}

	@Override
	public int getRecipe(int id) {
		
		return 0;
	}

	@Override
	public void addRecipe(){
		
	}
	
	

}
