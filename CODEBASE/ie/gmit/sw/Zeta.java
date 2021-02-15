package ie.gmit.sw;



/**
 * @author Tomas Omalley
 * @version 1.0
 * @since 1.8
 * 
 *   
// Public class Zeta implements the class Omega and returns a byte 
 */

public class Zeta implements Omega {
	
	/**
	 
	 * 
	 *   
 	 * Class Zeta returns a byte 
	 */
	
	@Override
	public int getZetaValue(int b) {
		return (byte) (b & 0x000000FF);
	}
}