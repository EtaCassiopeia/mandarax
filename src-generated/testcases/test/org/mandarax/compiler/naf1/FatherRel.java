package test.org.mandarax.compiler.naf1;
 
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>Father</strong>.
 * @version Nov 15, 2010 11:28:46 AM 
 */
public class FatherRel {

	// constructors
	public FatherRel () {
		super();
	}
	
	public FatherRel ( Person father , Person child ) {
		super();
		this.father=father; 
		this.child=child; 
		
	}

	// instance variables created for slots
	 
	public Person father = null; 
	 
	public Person child = null; 
	

}
