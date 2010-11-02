package test.org.mandarax.compiler.reldef12;
 
import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>GrandFather</strong>.
 * @version Nov 2, 2010 7:09:58 PM 
 */
public class GrandFatherRelInstances {
	// object references
	 
	public static Person jens = new Person("Jens");
	 
	public static Person max = new Person("Max");
	 
	public static Person klaus = new Person("Klaus");
	 
	public static Person otto = new Person("Otto");
	 
	public static Person xiomara = new Person("Xiomara");
	
	
	// fields representing annotations
	
	// rule: rule1: Father(x,y) & Father(y,z) -> GrandFather(x.getName(),z.getName());
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1: Father(x,y) & Father(y,z) -> GrandFather(x.getName(),z.getName());
		
		// rule annotations for rule  rule1: Father(x,y) & Father(y,z) -> GrandFather(x.getName(),z.getName());
		
		
	}
		
	

	// interface generated for queries	
	 
	public ResultSet<GrandFatherRel> getGrandChildren (  String grandFather  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<GrandFatherRel>(getGrandChildren ( _derivation ,  grandFather ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<GrandFatherRel> getGrandChildren ( final DerivationController _derivation ,  final String grandFather  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<GrandFatherRel>(1) {
			
			public ResourceIterator<GrandFatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1: Father(x,y) & Father(y,z) -> GrandFather(x.getName(),z.getName());
                			return getGrandChildren_0(_derivation.pop(_derivationlevel) ,  grandFather );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getGrandChildren
	// rule: rule1: Father(x,y) & Father(y,z) -> GrandFather(x.getName(),z.getName());
	private static ResourceIterator<GrandFatherRel> getGrandChildren_0 (final DerivationController _derivation ,  final String grandFather ) {
		
		_derivation.log("GrandFather.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private java.lang.String __t0 = grandFather;
			private test.org.mandarax.compiler.Person z = null;
			private test.org.mandarax.compiler.Person x = null;
			private test.org.mandarax.compiler.Person y = null;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite __t0==__t0
		 
					if (!(org.mandarax.rt.Equals.compare(_bindings.__t0,_bindings.__t0))) {return EmptyIterator.DEFAULT;} 
		 
		// apply prerequisite Father(x,y)
		final ResourceIterator<FatherRel> iterator2 = FatherRelInstances.getFatherAndChild(_derivation.push());
		
		
		 
		// apply prerequisite Father(y,z)
		final ResourceIterator<FatherRel> iterator3 =  new NestedIterator<FatherRel, FatherRel>(iterator2) {
                	public ResourceIterator<FatherRel> getNextIterator(FatherRel _object) {
                				// bind parameters from Father(x,y)
						_bindings.x = _object.father;
						_bindings.y = _object.child;
						
									return FatherRelInstances.getChildren(_derivation.push(),_bindings.y);
                	}
            	};
		
		
		
		// rule head
		return new NestedIterator<FatherRel, GrandFatherRel>(iterator3) {
                	public ResourceIterator<GrandFatherRel> getNextIterator(FatherRel _object) {
						// bind parameters from Father(y,z)
						_bindings.z = _object.child;
						
                    				return new SingletonIterator(new GrandFatherRel(_bindings.__t0,_bindings.z.getName()));
                	}
        	};
        
		
		
		
	

		
	}
	
	
}
