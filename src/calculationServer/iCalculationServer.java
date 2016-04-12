package calculationServer;

import common.Ingredient;
import common.Recipe;

interface iCalculationServer extends java.rmi.Remote {

	public Ingredient getIngredient(int ID);
	
}
