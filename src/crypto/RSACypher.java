package crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;

public class RSACypher extends AbstractCypher {
	private KeyPair keyRing;
	
	public RSACypher() throws Exception{
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);
		keyRing = keyGen.generateKeyPair();
		setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.getClass().getName()+"="+this);
	}



	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		return super.encrypt(plainText, keyRing.getPublic());
	}



	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return super.decrypt(cypherText, keyRing.getPrivate());
	}
	
	
	

}
