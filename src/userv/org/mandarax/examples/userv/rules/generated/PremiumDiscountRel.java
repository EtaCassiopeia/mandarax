package org.mandarax.examples.userv.rules.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>PremiumDiscount</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 23, 2010 11:18:35 PM
 */
public class PremiumDiscountRel {

	// fields created for slots
	public Car car = null;
	public int discount = 0;

	// constructors
	public PremiumDiscountRel() {
		super();
	}

	public PremiumDiscountRel(Car car, int discount) {
		super();
		this.car = car;
		this.discount = discount;

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
		PremiumDiscountRel _tmp = (PremiumDiscountRel) obj;
		return new EqualsBuilder().append(car, _tmp.car).append(discount, _tmp.discount).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(car).append(discount).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("car", car).append("discount", discount).toString();
	}

}
