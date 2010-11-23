package org.mandarax.examples.userv.rules.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>IsEligible</strong>. Generated by
 * org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 23, 2010 11:18:35 PM
 */
public class IsEligibleRel {

	// fields created for slots
	public Driver driver = null;

	// constructors
	public IsEligibleRel() {
		super();
	}

	public IsEligibleRel(Driver driver) {
		super();
		this.driver = driver;

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
		IsEligibleRel _tmp = (IsEligibleRel) obj;
		return new EqualsBuilder().append(driver, _tmp.driver).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(driver).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("driver", driver).toString();
	}

}
