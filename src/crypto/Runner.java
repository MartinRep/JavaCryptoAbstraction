package crypto;

public class Runner {

	public static void main(String[] args) throws Throwable {
		//RSACypher rsa = new RSACypher();
		CypherFactory cf = CypherFactory.getInstance();
		Cypher c = cf.newCypher(CypherType.Asymmetric);
		
		String message = "Hello";
		
		byte[] enc = c.encrypt(message.getBytes());
		
		System.out.println(new String(c.decrypt(enc)));

	}

}
