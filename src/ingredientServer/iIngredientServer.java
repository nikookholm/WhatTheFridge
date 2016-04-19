package ingredientServer;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface iIngredientServer {

	@WebMethod
	public void getIngredient(int id);
	
	@WebMethod
	public void getAll();
	
	@WebMethod
	public void add(Ingredient ingredient);

}