package org.mandarax.examples.userv.rules.generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>PotentialTheftRating</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Nov 19, 2010 12:12:11 PM 
 */
public class PotentialTheftRatingRel {

	// fields created for slots 
	public Car car = null; 
	public String rating = null;
	
	// constructors
	public PotentialTheftRatingRel () {
		super();
	}
	
	public PotentialTheftRatingRel ( Car car , String rating ) {
		super();
		this.car=car; 
		this.rating=rating; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		PotentialTheftRatingRel _tmp = (PotentialTheftRatingRel) obj;
   		return new EqualsBuilder()
            .append(car, _tmp.car)
            .append(rating, _tmp.rating)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(car)
            .append(rating)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("car",car)
    		.append("rating",rating)
    		.toString();
   }
   

}
