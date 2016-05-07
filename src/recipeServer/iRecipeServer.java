package recipeServer;


import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;

import database.DALException;

@WebService
public interface iRecipeServer {
	
	@WebMethod
	public abstract Recipe getRecipe(int id) throws DALException;
	
	@WebMethod
	public abstract ArrayList<Recipe> getRecipeList() throws DALException;

	@WebMethod
	public abstract void addRecipe(Recipe recipe) throws DALException;
	
	public String isConnected();

}