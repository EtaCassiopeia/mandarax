package test.org.mandarax.compiler.reldef8;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Related</strong>.
 * @version Nov 3, 2010 1:08:09 PM 
 */
public class RelatedRelInstances {
	// object references
	
	
	// fields representing annotations
	
	// rule: fact1:  -> Related("John","Tom");
	private final static java.util.Properties _annotations_fact1 = new java.util.Properties();
	
	// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
	private final static java.util.Properties _annotations__Father_extends_Related = new java.util.Properties();
	
	// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
	private final static java.util.Properties _annotations__GrandFather_extends_Related = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  fact1:  -> Related("John","Tom");
		
		// rule annotations for rule  fact1:  -> Related("John","Tom");
		
		
	
		// relationship annotations for rule  _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
		
		// rule annotations for rule  _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
		
		
	
		// relationship annotations for rule  _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
		
		// rule annotations for rule  _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
		
		
	}
		
	

	// interface generated for queries	
	 
	public ResultSet<RelatedRel> getRelated1 (  String person1  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<RelatedRel>(getRelated1 ( _derivation ,  person1 ),_derivation);
	} 
	 
	public ResultSet<RelatedRel> getRelated2 (  String person2  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<RelatedRel>(getRelated2 ( _derivation ,  person2 ),_derivation);
	} 
	 
	public ResultSet<RelatedRel> isRelated (  String person1 ,  String person2  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<RelatedRel>(isRelated ( _derivation ,  person1 ,  person2 ),_derivation);
	} 
	 
	public ResultSet<RelatedRel> getAll (  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<RelatedRel>(getAll ( _derivation  ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<RelatedRel> getRelated1 ( final DerivationController _derivation ,  final String person1  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<RelatedRel>(3) {
			
			public ResourceIterator<RelatedRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke fact1:  -> Related("John","Tom");
                			return getRelated1_0(_derivation.pop(_derivationlevel) ,  person1 );
                		}
				
                		case 1: {
                			// invoke _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
                			return getRelated1_1(_derivation.pop(_derivationlevel) ,  person1 );
                		}
				
                		case 2: {
                			// invoke _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
                			return getRelated1_2(_derivation.pop(_derivationlevel) ,  person1 );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<RelatedRel> getRelated2 ( final DerivationController _derivation ,  final String person2  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<RelatedRel>(3) {
			
			public ResourceIterator<RelatedRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke fact1:  -> Related("John","Tom");
                			return getRelated2_0(_derivation.pop(_derivationlevel) ,  person2 );
                		}
				
                		case 1: {
                			// invoke _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
                			return getRelated2_1(_derivation.pop(_derivationlevel) ,  person2 );
                		}
				
                		case 2: {
                			// invoke _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
                			return getRelated2_2(_derivation.pop(_derivationlevel) ,  person2 );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<RelatedRel> isRelated ( final DerivationController _derivation ,  final String person1 ,  final String person2  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<RelatedRel>(3) {
			
			public ResourceIterator<RelatedRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke fact1:  -> Related("John","Tom");
                			return isRelated_0(_derivation.pop(_derivationlevel) ,  person1 ,  person2 );
                		}
				
                		case 1: {
                			// invoke _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
                			return isRelated_1(_derivation.pop(_derivationlevel) ,  person1 ,  person2 );
                		}
				
                		case 2: {
                			// invoke _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
                			return isRelated_2(_derivation.pop(_derivationlevel) ,  person1 ,  person2 );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<RelatedRel> getAll ( final DerivationController _derivation   ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<RelatedRel>(3) {
			
			public ResourceIterator<RelatedRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke fact1:  -> Related("John","Tom");
                			return getAll_0(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 1: {
                			// invoke _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
                			return getAll_1(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 2: {
                			// invoke _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
                			return getAll_2(_derivation.pop(_derivationlevel)  );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getRelated1
	// rule: fact1:  -> Related("John","Tom");
	private static ResourceIterator<RelatedRel> getRelated1_0 (final DerivationController _derivation ,  final String person1 ) {
		
		_derivation.log("Related.fact1", DerivationController.RULE, _annotations_fact1);
		
			
		
		 
		// check conditions	
		if (Equals.compare(person1,"John") ) {
		
		
		// create new instance of relationship
		RelatedRel _result = new RelatedRel();
		
		// set values
		_result.person1 = "John";
		_result.person2 = "Tom";
		
		return new SingletonIterator<RelatedRel>(_result);
		}
			
		// fact does not match query	
		return EmptyIterator.DEFAULT;
		

		
	}
	// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> getRelated1_1 (final DerivationController _derivation ,  final String person1 ) {
		
		_derivation.log("Related._Father_extends_Related", DerivationController.RULE, _annotations__Father_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [Father(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = person1;
			private java.lang.String _x1 = null;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite Father(_x0,_x1)
		final ResourceIterator<FatherRel> iterator1 = FatherRelInstances.getChildren(_derivation.push(),_bindings._x0);
		
		
		
		
		// rule head
		return new NestedIterator<FatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(FatherRel _object) {
						// bind parameters from Father(_x0,_x1)
						_bindings._x1 = _object.child;
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> getRelated1_2 (final DerivationController _derivation ,  final String person1 ) {
		
		_derivation.log("Related._GrandFather_extends_Related", DerivationController.RULE, _annotations__GrandFather_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [GrandFather(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = person1;
			private java.lang.String _x1 = null;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite GrandFather(_x0,_x1)
		final ResourceIterator<GrandFatherRel> iterator1 = GrandFatherRelInstances.getGrandChildren(_derivation.push(),_bindings._x0);
		
		
		
		
		// rule head
		return new NestedIterator<GrandFatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(GrandFatherRel _object) {
						// bind parameters from GrandFather(_x0,_x1)
						_bindings._x1 = _object.grandChild;
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// query: getRelated2
	// rule: fact1:  -> Related("John","Tom");
	private static ResourceIterator<RelatedRel> getRelated2_0 (final DerivationController _derivation ,  final String person2 ) {
		
		_derivation.log("Related.fact1", DerivationController.RULE, _annotations_fact1);
		
			
		
		 
		// check conditions	
		if (Equals.compare(person2,"Tom") ) {
		
		
		// create new instance of relationship
		RelatedRel _result = new RelatedRel();
		
		// set values
		_result.person1 = "John";
		_result.person2 = "Tom";
		
		return new SingletonIterator<RelatedRel>(_result);
		}
			
		// fact does not match query	
		return EmptyIterator.DEFAULT;
		

		
	}
	// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> getRelated2_1 (final DerivationController _derivation ,  final String person2 ) {
		
		_derivation.log("Related._Father_extends_Related", DerivationController.RULE, _annotations__Father_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [Father(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = null;
			private java.lang.String _x1 = person2;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite Father(_x0,_x1)
		final ResourceIterator<FatherRel> iterator1 = FatherRelInstances.getFather(_derivation.push(),_bindings._x1);
		
		
		
		
		// rule head
		return new NestedIterator<FatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(FatherRel _object) {
						// bind parameters from Father(_x0,_x1)
						_bindings._x0 = _object.father;
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> getRelated2_2 (final DerivationController _derivation ,  final String person2 ) {
		
		_derivation.log("Related._GrandFather_extends_Related", DerivationController.RULE, _annotations__GrandFather_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [GrandFather(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = null;
			private java.lang.String _x1 = person2;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite GrandFather(_x0,_x1)
		final ResourceIterator<GrandFatherRel> iterator1 = GrandFatherRelInstances.getGrandFather(_derivation.push(),_bindings._x1);
		
		
		
		
		// rule head
		return new NestedIterator<GrandFatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(GrandFatherRel _object) {
						// bind parameters from GrandFather(_x0,_x1)
						_bindings._x0 = _object.grandFather;
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// query: isRelated
	// rule: fact1:  -> Related("John","Tom");
	private static ResourceIterator<RelatedRel> isRelated_0 (final DerivationController _derivation ,  final String person1 ,  final String person2 ) {
		
		_derivation.log("Related.fact1", DerivationController.RULE, _annotations_fact1);
		
			
		
		 
		// check conditions	
		if (Equals.compare(person1,"John") && Equals.compare(person2,"Tom") ) {
		
		
		// create new instance of relationship
		RelatedRel _result = new RelatedRel();
		
		// set values
		_result.person1 = "John";
		_result.person2 = "Tom";
		
		return new SingletonIterator<RelatedRel>(_result);
		}
			
		// fact does not match query	
		return EmptyIterator.DEFAULT;
		

		
	}
	// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> isRelated_1 (final DerivationController _derivation ,  final String person1 ,  final String person2 ) {
		
		_derivation.log("Related._Father_extends_Related", DerivationController.RULE, _annotations__Father_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [Father(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = person1;
			private java.lang.String _x1 = person2;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite Father(_x0,_x1)
		final ResourceIterator<FatherRel> iterator1 = FatherRelInstances.isFather(_derivation.push(),_bindings._x0,_bindings._x1);
		
		
		
		
		// rule head
		return new NestedIterator<FatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(FatherRel _object) {
						// bind parameters from Father(_x0,_x1)
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> isRelated_2 (final DerivationController _derivation ,  final String person1 ,  final String person2 ) {
		
		_derivation.log("Related._GrandFather_extends_Related", DerivationController.RULE, _annotations__GrandFather_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [GrandFather(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = person1;
			private java.lang.String _x1 = person2;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite GrandFather(_x0,_x1)
		final ResourceIterator<GrandFatherRel> iterator1 = GrandFatherRelInstances.isGrandFather(_derivation.push(),_bindings._x0,_bindings._x1);
		
		
		
		
		// rule head
		return new NestedIterator<GrandFatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(GrandFatherRel _object) {
						// bind parameters from GrandFather(_x0,_x1)
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// query: getAll
	// rule: fact1:  -> Related("John","Tom");
	private static ResourceIterator<RelatedRel> getAll_0 (final DerivationController _derivation  ) {
		
		_derivation.log("Related.fact1", DerivationController.RULE, _annotations_fact1);
		
			
		
		
		
		// create new instance of relationship
		RelatedRel _result = new RelatedRel();
		
		// set values
		_result.person1 = "John";
		_result.person2 = "Tom";
		
		return new SingletonIterator<RelatedRel>(_result);
		

		
	}
	// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> getAll_1 (final DerivationController _derivation  ) {
		
		_derivation.log("Related._Father_extends_Related", DerivationController.RULE, _annotations__Father_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _Father_extends_Related: Father(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [Father(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = null;
			private java.lang.String _x1 = null;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite Father(_x0,_x1)
		final ResourceIterator<FatherRel> iterator1 = FatherRelInstances.getFatherAndChild(_derivation.push());
		
		
		
		
		// rule head
		return new NestedIterator<FatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(FatherRel _object) {
						// bind parameters from Father(_x0,_x1)
						_bindings._x0 = _object.father;
						_bindings._x1 = _object.child;
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
	private static ResourceIterator<RelatedRel> getAll_2 (final DerivationController _derivation  ) {
		
		_derivation.log("Related._GrandFather_extends_Related", DerivationController.RULE, _annotations__GrandFather_extends_Related);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: _GrandFather_extends_Related: GrandFather(_x0,_x1) -> Related(_x0,_x1);
		// prereqs: [GrandFather(_x0,_x1)]
		class _Bindings {
			private java.lang.String _x0 = null;
			private java.lang.String _x1 = null;
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite GrandFather(_x0,_x1)
		final ResourceIterator<GrandFatherRel> iterator1 = GrandFatherRelInstances.getAll(_derivation.push());
		
		
		
		
		// rule head
		return new NestedIterator<GrandFatherRel, RelatedRel>(iterator1) {
                	public ResourceIterator<RelatedRel> getNextIterator(GrandFatherRel _object) {
						// bind parameters from GrandFather(_x0,_x1)
						_bindings._x0 = _object.grandFather;
						_bindings._x1 = _object.grandChild;
						
                    				return new SingletonIterator(new RelatedRel(_bindings._x0,_bindings._x1));
                	}
        	};
        
		
		
		
	

		
	}
	
	
}

