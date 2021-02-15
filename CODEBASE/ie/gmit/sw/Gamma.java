package ie.gmit.sw;

/**

* @author Tomas Omalley
* @version 1.0
* @since 1.8
* 
* public class Gama takes in a byte B and returns state as an integer 
*/

public class Gamma {
	public byte gamma(byte b) {
		return (byte) (Integer.reverse(b));
	}
}