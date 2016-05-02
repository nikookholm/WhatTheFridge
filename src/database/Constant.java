package database;


// erstat konstanterne nedenfor

public abstract class Constant
{
	public static final String
		server					= "db4free.net/distribueret",  // database-serveren
		database				=  "distribueret",  //"jdbcdatabase", // navnet paa din database = dit studienummer
		username				= "dist", // dit brugernavn = dit studienummer 
		password				= "dist12"; // dit password som du har valgt til din database
	
	public static final int
		port					= 3306;
}
