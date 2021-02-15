package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * @author Tomas Omalley
 * @version 1.0
 * @since 1.8
 * 
 *        public class holds collection of type beta and gamma  
 */
public class Alpha {

	private Status status;
	private Collection<Beta> betas = new ArrayList<>();
	private Collection<Gamma> gammas = new ArrayList<>();

	public Alpha(Status status) {
		this.status = status;
	}


	/**
	 
	 * 
	 *   
	// iterator of beta classes
	 */
	
	public void add(Beta beta) {
		switch(status) {
			case Slight, Medium, Low -> betas.add(beta);
			case High, Extreme -> {
				Delta delta = new Delta();
				delta.add(beta);
			}
		}
	}


	
	/**
	 
	 * 
	 *   
	// iterator of beta classes
	 */
	
	
	// collection
	
	public Status getStatus() {
		return status;
	}
	
	public void add(Gamma gamma) {
		gammas.add(gamma);
	}
	
	public void remove(Beta beta) {
		betas.remove(beta);
	}
	
	public void remove(Gamma gamma) {
		gammas.remove(gamma);
	}
	
	public Iterator<Beta> betaIterator(){
		return betas.iterator();
	}

	public Iterator<Gamma> gammaIterator(){
		return gammas.iterator();
	}
}