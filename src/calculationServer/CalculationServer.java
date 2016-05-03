package calculationServer;

import java.rmi.Naming;

public class CalculationServer {

	public static void main(String[] args) throws Exception {
		java.rmi.registry.LocateRegistry.createRegistry(1099);
		
		//iCalculation CalcServer = new CalculationImpl();
		
		//Naming.rebind("rmi://localhost/CalculationServer", CalcServer);
		

	}

}
