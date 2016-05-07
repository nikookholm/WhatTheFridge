package ingredientServer;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import database.DALException;

@WebService
public interface iIngredientServer {

	@WebMethod
	public Ingredient getIngredient(int id) throws DALException;
	
	@WebMethod
	public List<Ingredient> getAll() throws DALException;
	
	@WebMethod
	public void addIngredient(Ingredient ingredient) throws DALException;
	
	
	public String isConnected();
		
}