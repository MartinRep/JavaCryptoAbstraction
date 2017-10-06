package crypto;

public class CypherFactory {
	//Singleton Step 2: Create a static instance
	
	//An eager Singleton
	//private static CypherFactory cf = new CypherFactory();

	private static CypherFactory cf = null;
	
	//Singleton Step 1
	private CypherFactory(){
		
	}
	//Singleton method
	public static CypherFactory getInstance(){
		if (cf == null) cf = new CypherFactory();
		return cf;
	}
	
	public Cypher newCypher(CypherType type) throws Exception{
		if (type == CypherType.Asymmetric)
		{
			return new RSACypher();
		} else {
		return null;
		}
	}
}
