package test.org.mandarax.compiler.reldef10;
 
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>Father</strong>.
 * @version Nov 2, 2010 7:09:58 PM 
 */
public class FatherRel {

	// constructors
	public FatherRel () {
		super();
	}
	
	public FatherRel ( String father , String child ) {
		super();
		this.father=father; 
		this.child=child; 
		
	}

	// instance variables created for slots
	 
	public String father = null; 
	 
	public String child = null; 
	

}
