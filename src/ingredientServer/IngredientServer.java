package ingredientServer;

import javax.xml.ws.Endpoint;

public class IngredientServer implements iIngredientServer {
	
	

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
	}

	@Override
	public void getIngredient(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Ingredient ingredient) {
		// TODO Auto-generated method stub
		
	}

}
