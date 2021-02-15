package ie.gmit.sw;


import java.util.Iterator;


	/**
	 *   
	// Client class holds main method and iterates over objects  
	 * @author Tomas Omalley
	 * @version 1.0
	 * @since 1.8
	 */

public class Client   {

	

	/**
	 
	 * 
	 *   
	// main method signature 
	 */

    public static void main(String[] args )
    {
    	

	/**
	 
	 * 
	 *   
	// loop  over and instantiate objects 
	 */
        for(int i=0; i<10; i++)
        {
            Beta b = new Beta();
            Epsilon  e = new Epsilon();
            Zeta z = new Zeta();
            Gamma g = new Gamma();
            
             Delta.getInstance().add(b);
        }

    }

}
