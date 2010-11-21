package org.mandarax.examples.userv.rules.generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>AdditionalDriverPremium</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Nov 21, 2010 9:48:16 PM 
 */
public class AdditionalDriverPremiumRel {

	// fields created for slots 
	public Driver driver = null; 
	public int premium = 0;
	
	// constructors
	public AdditionalDriverPremiumRel () {
		super();
	}
	
	public AdditionalDriverPremiumRel ( Driver driver , int premium ) {
		super();
		this.driver=driver; 
		this.premium=premium; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		AdditionalDriverPremiumRel _tmp = (AdditionalDriverPremiumRel) obj;
   		return new EqualsBuilder()
            .append(driver, _tmp.driver)
            .append(premium, _tmp.premium)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(driver)
            .append(premium)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("driver",driver)
    		.append("premium",premium)
    		.toString();
   }
   

}

