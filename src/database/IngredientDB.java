package database;

import ingredientServer.Ingredient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngredientDB {

	public Ingredient getIngredient(int ingredientId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM ingredients WHERE id = " + ingredientId);
	    try {
	    	if (!rs.first()) throw new DALException("Couldn't find ingredient with ID " + ingredientId);
	    	return new Ingredient(rs.getInt("id"), rs.getString("name"), rs.getDouble("amount"), rs.getString("unit"));
	    }
	    catch (SQLException e) {throw new DALException(e.getMessage()); }
		
	}
	
	public List<Ingredient> getIngredientList() throws DALException {
		List<Ingredient> list = new ArrayList<Ingredient>();
		ResultSet rs = Connector.doQuery("SELECT * FROM ingredients");
		try
		{
			while (rs.next()) 
			{
				list.add(new Ingredient(rs.getInt("id"), rs.getString("name"), rs.getDouble("amount"), rs.getString("unit")));
			}
		}
		catch (SQLException e) { throw new DALException(e.getMessage()); }
		return list;
	}

	public void addIngredient(Ingredient ingredient) throws DALException {
		Connector.doUpdate(
				"INSERT INTO ingredients(id, name, amount, unit) VALUES " +
				"(" + ingredient.getID() + ", '" + ingredient.getName() + "', '" + ingredient.getAmount() + "', '" + ingredient.getUnit() + "')"
			);
		
	}

	public void updateIngredient(Ingredient ingredient) throws DALException {
		Connector.doUpdate(
				"UPDATE ingredient SET name = '" + ingredient.getName() + "', amount =  '" + ingredient.getAmount() +"', unit = '" + ingredient.getUnit() + "' " +
				"WHERE id = " + ingredient.getID()
		);
	}

}
