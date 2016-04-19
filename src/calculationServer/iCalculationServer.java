package calculationServer;

import recipeServer.Recipe;
import ingredientServer.Ingredient;

interface iCalculationServer extends java.rmi.Remote {

	public Ingredient getIngredient(int ID);
	
}
