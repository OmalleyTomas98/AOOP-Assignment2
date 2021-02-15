package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
	 * 
	 *   
	// Beta class takes in a byte b and returns byte and hex
	 * @author Tomas Omalley
	 * @version 1.0
	 * @since 1.8 
	 */

public class Beta {
	
	private static Status status;
	private static Collection<Beta> betas = new ArrayList<>();
	
	
/**
 
 * 
 *   
// Beta class takes in a byte b and returns byte 
 */

	public byte beta(byte b)  {
		int i = b;
		return (byte) (i ^ 0xFFFFFFFF);
	}
	
	
	
	/**
	 
	 * 
	 *   
	// remove object instance of beta 
	 */
	
	public void remove(Beta beta)
	{
		beta.remove(beta);
	}
	
	/**
	 
	 * 
	 *   
	// iterate of collection of beta objects 
	 */
	
	public Iterator<Beta> betaIterator(){
		return betas.iterator();
		
	}
	
	
	/**
	 
	 * 
	 *   
	// search containing instance of beta object 
	 */
	
	public boolean hasBeta(Beta beta) {
		
		return betas.contains(beta);
	}
	
	
	
	/**
	 
	 * 
	 *   
	// search containing instance of beta object 
	 */
	public Status getStatus() {
		
		return status;
	}
}