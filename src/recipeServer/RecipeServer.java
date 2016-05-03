package recipeServer;

import ingredientServer.Ingredient;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import database.DALException;
import database.RecipeDB;

@WebService(endpointInterface = "recipeServer.recipeServer")
public class RecipeServer implements iRecipeServer {
	
	private RecipeDB db; 
		
	public RecipeServer(){
		init();
	}

	public void init(){
		db = new RecipeDB();
		Endpoint.publish("http://[::]:3400/recipeserver", this);
	}


	@Override
	public Recipe getRecipe(int id) throws DALException {
		return db.getRecipe(id);
	}

	@Override
	public void addRecipe(Recipe recipe) throws DALException{
		db.addRecipe(recipe);
	}

	@Override
	public ArrayList<Recipe> getRecipeList() throws DALException {
		return db.getRecipeList();
	}
	
	

}
