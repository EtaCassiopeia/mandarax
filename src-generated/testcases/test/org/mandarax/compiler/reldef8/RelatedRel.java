package test.org.mandarax.compiler.reldef8;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Class representing the relationship <strong>Related</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version 23/12/2010 5:25:39 AM 
 */
public class RelatedRel {

	// fields created for slots 
	public String person1 = null; 
	public String person2 = null;
	
	// constructors
	public RelatedRel () {
		super();
	}
	
	public RelatedRel ( String person1 , String person2 ) {
		super();
		this.person1=person1; 
		this.person2=person2; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		RelatedRel _tmp = (RelatedRel) obj;
   		return new EqualsBuilder()
            .append(person1, _tmp.person1)
            .append(person2, _tmp.person2)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(person1)
            .append(person2)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("person1",person1)
    		.append("person2",person2)
    		.toString();
   }
   

}

