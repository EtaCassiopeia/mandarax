package test.org.mandarax.compiler.reldef5;
 
import test.org.mandarax.compiler.Person;

/**
 * Class representing the relationship <strong>GrandFather</strong>.
 * @version Oct 25, 2010 9:56:38 PM 
 */
public class GrandFather {

	// constructors
	public GrandFather () {
		super();
	}
	
	public GrandFather ( Person grandFather , Person grandChild ) {
		super();
		this.grandFather=grandFather; 
		this.grandChild=grandChild; 
		
	}

	// instance variables created for slots
	 
	public Person grandFather = null; 
	 
	public Person grandChild = null; 
	

}

