package recipeServer;

import ingredientServer.Ingredient;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface iRecipeServer {
	
	@WebMethod
	public abstract ArrayList<Ingredient> getAllRecipes();

	@WebMethod
	public abstract int getRecipe(int id);

	@WebMethod
	public abstract void addRecipe();

}