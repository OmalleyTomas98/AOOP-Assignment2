package ie.gmit.sw;



/**

* @author Tomas Omalley
* @version 1.0
* @since 1.8
* 
* public class Epsilon takes in an integer  i  and returns state as an integer and hex  
*/
public class Epsilon {
	public int epsilon(int i) {
		return i & 0xFF000000;
	}
}
