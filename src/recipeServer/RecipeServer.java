package recipeServer;

import ingredientServer.Ingredient;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "recipeServer.recipeServer")
public class RecipeServer implements iRecipeServer {
		
	public RecipeServer(){
		init();
	}

	public void init(){
		Endpoint.publish("http://[::]:1337/recipeserver", this);
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
