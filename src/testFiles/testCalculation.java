package testFiles;



import calculationServer.*;

public class testCalculation {

	public static void main(String[] args) {

		
			CalculationImpl CalcServer = new CalculationImpl();
			System.out.println(CalcServer.testConnection());
			//System.out.println(CalcServer.getIngredient(2));
		
	}

}
