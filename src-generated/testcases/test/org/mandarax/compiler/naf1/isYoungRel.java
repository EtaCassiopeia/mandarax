package test.org.mandarax.compiler.naf1;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>isYoung</strong>. Generated by
 * org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 23, 2010 3:01:09 PM
 */
public class isYoungRel {

	// fields created for slots
	public Person person = null;

	// constructors
	public isYoungRel() {
		super();
	}

	public isYoungRel(Person person) {
		super();
		this.person = person;

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
		isYoungRel _tmp = (isYoungRel) obj;
		return new EqualsBuilder().append(person, _tmp.person).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(person).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("person", person).toString();
	}

}
