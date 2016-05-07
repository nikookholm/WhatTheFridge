package recipeServer;

import ingredientServer.Ingredient;
import ingredientServer.IngredientServer;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import database.DALException;
import database.RecipeDB;

@WebService(endpointInterface = "recipeServer.iRecipeServer")
public class RecipeServer implements iRecipeServer {
	
	private RecipeDB db; 
	
	public static void main(String[] args) {

		new RecipeServer();
		
	}
	
	public RecipeServer(){
		init();
	}

	public void init(){
		db = new RecipeDB();
		Endpoint.publish("http://localhost:9998/iRecipeS", this);
	}


	@Override
	public Recipe getRecipe(int id) throws DALException {
		return db.getRecipe(id);
	}

	public String isConnected(){
		return "Connected to recipes";
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
