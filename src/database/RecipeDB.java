package database;

import ingredientServer.Ingredient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import recipeServer.Recipe;

public class RecipeDB {
	
	private ArrayList<Ingredient> loadIngredients(String dbInput) throws DALException
	{
		ArrayList<Ingredient> ingredientsList = new ArrayList<Ingredient>();
		IngredientDB db = new IngredientDB();
		
		int id;
		
		for(String s : dbInput.split(","))
		{
			id = Integer.parseInt(s);
			ingredientsList.add(db.getIngredient(id));
		}
		
		return new ArrayList<Ingredient>();
	}
	
	private String saveIngredients(ArrayList<Ingredient> ingredients)
	{
		String idList = "";
		
		for(Ingredient i : ingredients)
		{
			idList += i + ",";
		}
		
		idList = idList.substring(0, idList.length()-1);
		
		return idList;
	}

	public Recipe getRecipe(int recipeId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM recipes WHERE id = " + recipeId);
	    try {
	    	if (!rs.first()) throw new DALException("Couldn't find recipe with ID " + recipeId);
	    	return new Recipe(rs.getInt("id"), rs.getString("name"), loadIngredients(rs.getString("ingredients")), rs.getString("description"));
	    }
	    catch (SQLException e) {throw new DALException(e.getMessage()); }
		
	}
	
	public List<Recipe> getIRecipeList() throws DALException {
		List<Recipe> list = new ArrayList<Recipe>();
		ResultSet rs = Connector.doQuery("SELECT * FROM recipes");
		try
		{
			while (rs.next()) 
			{
				list.add(new Recipe(rs.getInt("id"), rs.getString("name"), loadIngredients(rs.getString("ingredients")), rs.getString("description")));
			}
		}
		catch (SQLException e) { throw new DALException(e.getMessage()); }
		return list;
	}

	public void addRecipe(Recipe recipe) throws DALException {
		Connector.doUpdate(
				"INSERT INTO recipes(id, name, ingredients, description) VALUES " +
				"(" + recipe.getID() + ", '" + recipe.getName() + "', '" + saveIngredients(recipe.getIngredients()) + "', '" + recipe.getDescription() + "')"
			);
		
	}

	public void updateRecipe(Recipe recipe) throws DALException {
		Connector.doUpdate(
				"UPDATE recipe SET name = '" + recipe.getName() + "', amount =  '" + saveIngredients(recipe.getIngredients()) +"', unit = '" + recipe.getDescription() + "' " +
				"WHERE id = " + recipe.getID()
		);
	}

}
