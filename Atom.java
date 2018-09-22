package lab2;

/**
*@Author Andrei Baechle
**/

public class Atom{
	
	/**
	 * 
	 * private instance variables
	 */
	private int protons;
	private int neutrons;
	private int electrons;
	
	/**
	 *  makes constructors
	 *  
	 */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) {
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;
	}
	
	/**
	 * 
	 * returns atomic mass, protons added to neutrons
	 */
	public int getAtomicMass()	{
		int atomicMass = protons + neutrons;
		return (atomicMass);
	}
	
	/**
	 * 
	 * returns atomic charge, the difference of protons & electrons
	 */
	public int getAtomicCharge()	{
		int atomicCharge = protons - electrons;
		return (atomicCharge);
		
	}
	
	/**
	 * 
	 * returns atomic decay, decreases the number of protons and neutrons by 2
	 */
	public void decay()	{
		protons = protons - 2;
		neutrons = neutrons - 2;
	}	
		
				
	
}


