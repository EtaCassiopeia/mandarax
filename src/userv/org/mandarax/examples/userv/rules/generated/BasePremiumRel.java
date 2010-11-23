package org.mandarax.examples.userv.rules.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>BasePremium</strong>. Generated
 * by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 23, 2010 11:18:35 PM
 */
public class BasePremiumRel {

	// fields created for slots
	public Car car = null;
	public int premium = 0;

	// constructors
	public BasePremiumRel() {
		super();
	}

	public BasePremiumRel(Car car, int premium) {
		super();
		this.car = car;
		this.premium = premium;

	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		BasePremiumRel _tmp = (BasePremiumRel) obj;
		return new EqualsBuilder().append(car, _tmp.car).append(premium, _tmp.premium).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(car).append(premium).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("car", car).append("premium", premium).toString();
	}

}
