/*
 * Copyright 2010 Jens Dietrich Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package test.org.mandarax.compiler;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mandarax.rt.ResultSet;
import test.org.mandarax.compiler.reldef11.*;

/**
 * Test cases using generated code.
 * @author jens dietrich
 */
public class CompilerTests11 {
	
//	Person jens = new Person("Jens");
//	Person max = new Person("Max");
//	Person klaus = new Person("Klaus");
//	Person otto = new Person("Otto");
//	Person xiomara = new Person("Xiomara");
//	rel Father(Person father,Person child) queries getFather(child),isFather(father,child),getChildren(father),getFatherAndChild() {
//		rule1: -> Father(jens,max);
//		rule2: -> Father(jens,xiomara);
//		rule3: -> Father(klaus,jens);
//		rule4: -> Father(otto,klaus);
//	}
//	rel GrandFather(String grandFather,String grandChild) queries getAll(){
//		rule1: Father(x,y) & Father(y,z) -> GrandFather(x.name,z.name); 	
//	}
	
	@Test
	public void test1() throws Exception {
		ResultSet<GrandFatherRel> rs = new GrandFatherRelInstances().getAll();
		assertTrue(contains(rs,"Klaus","Max"));	
	}
	
	@Test
	public void test2() throws Exception {
		ResultSet<GrandFatherRel> rs = new GrandFatherRelInstances().getAll();
		assertTrue(contains(rs,"Otto","Jens"));	
	}
	
	@Test
	public void test3() throws Exception {
		ResultSet<GrandFatherRel> rs = new GrandFatherRelInstances().getAll();
		assertFalse(contains(rs,"Jens","Otto"));	
	}
	
	@Test
	public void test4() throws Exception {
		ResultSet<GrandFatherRel> rs = new GrandFatherRelInstances().getAll();
		assertFalse(contains(rs,"Jens","Max"));	
	}
	
	
	private boolean contains(ResultSet<GrandFatherRel> rs, String grandFather, String grandChild) {
		while (rs.hasNext()) {
			GrandFatherRel rel = rs.next();
			if (rel.grandFather.equals(grandFather) && rel.grandChild.equals(grandChild)) {
				rs.close();
				return true;
			}
		}
		rs.close();
		return false;
	}


	
}