package ingredientServer;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import database.DALException;
import database.IngredientDB;

@WebService(endpointInterface = "ingredientServer.iIngredientServer")
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
		db = new IngredientDB();
		Endpoint.publish("http://localhost:9999/iIngredientS", this);
		
	}
	
	public String isConnected(){
		return "Connected to ingredients";
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
