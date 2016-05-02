package ingredientServer;

public class Ingredient {

	private int    id;
	private String name;
	private double amount;
	private String unit;
	
	public Ingredient(int id, String name, double amount, String unit)
	{
		this.id     = id;
		this.name   = name;
		this.amount = amount;
		this.unit   = unit;
	}
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public String getUnit(){
		return unit;
	}
}
