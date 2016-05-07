package testFiles;



import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import calculationServer.*;
import ingredientServer.IngredientServer;
import ingredientServer.iIngredientServer;
import recipeServer.iRecipeServer;

public class testCalculation {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/iIngredientS?wsdl");
		
		QName qname = new QName("http://ingredientServer/", "IngredientServerService");
		
		Service service = Service.create(url, qname);
		
		iIngredientServer is = service.getPort(iIngredientServer.class);
		System.out.println(is.isConnected());
			
			URL url1 = new URL("http://localhost:9998/iRecipeS?wsdl");
			
			QName qname1 = new QName("http://recipeServer/", "RecipeServerService");
			
			Service service1 = Service.create(url1, qname1);
			
			iRecipeServer ir = service1.getPort(iRecipeServer.class);
				System.out.println(ir.isConnected());
	}

}
