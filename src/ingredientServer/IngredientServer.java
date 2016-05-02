package ingredientServer;

import java.util.List;

import javax.xml.ws.Endpoint;

import database.DALException;
import database.IngredientDB;

public class IngredientServer implements iIngredientServer {
	
	IngredientDB db;

	public static void main(String[] args) {

		new IngredientServer();
		
	}
	
	public IngredientServer()
	{
		initialize();
	}
	
	public void initialize()
	{
		Endpoint.publish("localhost:1337", this);
		db = new IngredientDB();
	}

	@Override
	public Ingredient getIngredient(int id) throws DALException {
		return db.getIngredient(id);
	}


	@Override
	public void addIngredient(Ingredient ingredient) throws DALException {
		db.addIngredient(ingredient);
	}

	@Override
	public List<Ingredient> getAll() throws DALException {
		return db.getIngredientList();
	}

}
