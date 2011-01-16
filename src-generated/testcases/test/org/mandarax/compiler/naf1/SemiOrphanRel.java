package test.org.mandarax.compiler.naf1;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>SemiOrphan</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Jan 16, 2011 9:27:45 PM 
 */
public class SemiOrphanRel {

	// fields created for slots 
	public Person person = null;
	
	// constructors
	public SemiOrphanRel () {
		super();
	}
	
	public SemiOrphanRel ( Person person ) {
		super();
		this.person=person; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		SemiOrphanRel _tmp = (SemiOrphanRel) obj;
   		return new EqualsBuilder()
            .append(person, _tmp.person)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(person)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("person",person)
    		.toString();
   }
   

}

