package test.org.mandarax.compiler.reldef8;

/**
 * Class representing the relationship <strong>Related</strong>.
 * @version Nov 3, 2010 1:16:56 PM 
 */
public class RelatedRel {

	// constructors
	public RelatedRel () {
		super();
	}
	
	public RelatedRel ( String person1 , String person2 ) {
		super();
		this.person1=person1; 
		this.person2=person2; 
		
	}

	// instance variables created for slots
	 
	public String person1 = null; 
	 
	public String person2 = null; 
	

}

