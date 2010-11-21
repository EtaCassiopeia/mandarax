package org.mandarax.examples.userv.rules.generated;
 
import org.mandarax.examples.userv.domain.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>PotentialTheftRating</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Nov 21, 2010 9:48:17 PM 
 */
public class PotentialTheftRatingRelInstances {
	// object references
	 
	public static java.util.Collection highTheftProbabilityAutoList = null;
	
	
	// fields representing annotations
	
	// rule: AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
	private final static java.util.Properties _annotations_AE_PTC01 = new java.util.Properties();
	
	// rule: AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
	private final static java.util.Properties _annotations_AE_PTC02 = new java.util.Properties();
	
	// rule: AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
	private final static java.util.Properties _annotations_AE_PTC03 = new java.util.Properties();
	
	// rule: AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
	private final static java.util.Properties _annotations_AE_PTC04 = new java.util.Properties();
	
	// rule: AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
	private final static java.util.Properties _annotations_AE_PTC05 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
		_annotations_AE_PTC01.put("category","Auto Eligibility Rule Set");
		_annotations_AE_PTC01.put("author","Jens Dietrich");
		_annotations_AE_PTC01.put("lastupdated","19/11/10");
		
		// rule annotations for rule  AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
		_annotations_AE_PTC01.put("description","If the car is a convertible, then the car's potential theft rating is high");
		
		
	
		// relationship annotations for rule  AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
		_annotations_AE_PTC02.put("category","Auto Eligibility Rule Set");
		_annotations_AE_PTC02.put("author","Jens Dietrich");
		_annotations_AE_PTC02.put("lastupdated","19/11/10");
		
		// rule annotations for rule  AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
		_annotations_AE_PTC02.put("description","If the car's price is greater than $45,000, then the car's potential theft rating is high");
		
		
	
		// relationship annotations for rule  AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
		_annotations_AE_PTC03.put("category","Auto Eligibility Rule Set");
		_annotations_AE_PTC03.put("author","Jens Dietrich");
		_annotations_AE_PTC03.put("lastupdated","19/11/10");
		
		// rule annotations for rule  AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
		_annotations_AE_PTC03.put("description","If the car model is on the list of 'High Theft Probability Auto', then the car's potential theft rating is high");
		
		
	
		// relationship annotations for rule  AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
		_annotations_AE_PTC04.put("category","Auto Eligibility Rule Set");
		_annotations_AE_PTC04.put("author","Jens Dietrich");
		_annotations_AE_PTC04.put("lastupdated","19/11/10");
		
		// rule annotations for rule  AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
		_annotations_AE_PTC04.put("description","If all of the following are true, then the car's potential theft rating is moderate: car's price is between $20,000 and $45,000, car model is not on the list of 'High Theft Probability Auto'");
		
		
	
		// relationship annotations for rule  AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
		_annotations_AE_PTC05.put("category","Auto Eligibility Rule Set");
		_annotations_AE_PTC05.put("author","Jens Dietrich");
		_annotations_AE_PTC05.put("lastupdated","19/11/10");
		
		// rule annotations for rule  AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
		_annotations_AE_PTC05.put("description","If all of the following are true, then the car's potential theft rating is low: car's price is less that $20,000, car model is not on the list of 'High Theft Probability Auto'");
		
		
	}
		
	

	// interface generated for queries	
	 
	public static ResultSet<PotentialTheftRatingRel> getRating (  Car car  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<PotentialTheftRatingRel>(getRating ( _derivation ,  car ),_derivation);
	} 
	 
	public static ResultSet<PotentialTheftRatingRel> hasRating (  Car car ,  String rating  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<PotentialTheftRatingRel>(hasRating ( _derivation ,  car ,  rating ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<PotentialTheftRatingRel> getRating ( final DerivationController _derivation ,  final Car car  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<PotentialTheftRatingRel>(5) {
			
			public ResourceIterator<PotentialTheftRatingRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
                			return getRating_0(_derivation.pop(_derivationlevel) ,  car );
                		}
				
                		case 1: {
                			// invoke AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
                			return getRating_1(_derivation.pop(_derivationlevel) ,  car );
                		}
				
                		case 2: {
                			// invoke AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
                			return getRating_2(_derivation.pop(_derivationlevel) ,  car );
                		}
				
                		case 3: {
                			// invoke AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
                			return getRating_3(_derivation.pop(_derivationlevel) ,  car );
                		}
				
                		case 4: {
                			// invoke AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
                			return getRating_4(_derivation.pop(_derivationlevel) ,  car );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<PotentialTheftRatingRel> hasRating ( final DerivationController _derivation ,  final Car car ,  final String rating  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<PotentialTheftRatingRel>(5) {
			
			public ResourceIterator<PotentialTheftRatingRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
                			return hasRating_0(_derivation.pop(_derivationlevel) ,  car ,  rating );
                		}
				
                		case 1: {
                			// invoke AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
                			return hasRating_1(_derivation.pop(_derivationlevel) ,  car ,  rating );
                		}
				
                		case 2: {
                			// invoke AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
                			return hasRating_2(_derivation.pop(_derivationlevel) ,  car ,  rating );
                		}
				
                		case 3: {
                			// invoke AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
                			return hasRating_3(_derivation.pop(_derivationlevel) ,  car ,  rating );
                		}
				
                		case 4: {
                			// invoke AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
                			return hasRating_4(_derivation.pop(_derivationlevel) ,  car ,  rating );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getRating
	// rule: AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
	private static ResourceIterator<PotentialTheftRatingRel> getRating_0 (final DerivationController _derivation ,  final Car car ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC01", DerivationController.RULE, _annotations_AE_PTC01);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
		// prereqs: [_car.getConvertible()]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite _car.getConvertible()
		
		
		 // case 4
					if (!(_bindings._car.isConvertible())) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"high"));
        
		
		
		
	

	}
	// rule: AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
	private static ResourceIterator<PotentialTheftRatingRel> getRating_1 (final DerivationController _derivation ,  final Car car ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC02", DerivationController.RULE, _annotations_AE_PTC02);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
		// prereqs: [(_car.getPrice())>45000]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite (_car.getPrice())>45000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())>45000)) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"high"));
        
		
		
		
	

	}
	// rule: AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
	private static ResourceIterator<PotentialTheftRatingRel> getRating_2 (final DerivationController _derivation ,  final Car car ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC03", DerivationController.RULE, _annotations_AE_PTC03);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
		// prereqs: [highTheftProbabilityAutoList.contains(_car.getType())]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private java.util.Collection highTheftProbabilityAutoList = PotentialTheftRatingRelInstances.highTheftProbabilityAutoList;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite highTheftProbabilityAutoList.contains(_car.getType())
		
		
		 // case 4
					if (!(_bindings.highTheftProbabilityAutoList.contains(_bindings._car.getType()))) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"high"));
        
		
		
		
	

	}
	// rule: AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
	private static ResourceIterator<PotentialTheftRatingRel> getRating_3 (final DerivationController _derivation ,  final Car car ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC04", DerivationController.RULE, _annotations_AE_PTC04);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
		// prereqs: [(_car.getPrice())>20000, (_car.getPrice())<45000, !(highTheftProbabilityAutoList.contains(_car.getType()))]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private java.util.Collection highTheftProbabilityAutoList = PotentialTheftRatingRelInstances.highTheftProbabilityAutoList;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite (_car.getPrice())>20000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())>20000)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite (_car.getPrice())<45000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())<45000)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite !(highTheftProbabilityAutoList.contains(_car.getType()))
		
		
		 // case 4
					if (!(!(_bindings.highTheftProbabilityAutoList.contains(_bindings._car.getType())))) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"moderate"));
        
		
		
		
	

	}
	// rule: AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
	private static ResourceIterator<PotentialTheftRatingRel> getRating_4 (final DerivationController _derivation ,  final Car car ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC05", DerivationController.RULE, _annotations_AE_PTC05);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
		// prereqs: [(_car.getPrice())<20000, !(highTheftProbabilityAutoList.contains(_car.getType()))]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private java.util.Collection highTheftProbabilityAutoList = PotentialTheftRatingRelInstances.highTheftProbabilityAutoList;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite (_car.getPrice())<20000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())<20000)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite !(highTheftProbabilityAutoList.contains(_car.getType()))
		
		
		 // case 4
					if (!(!(_bindings.highTheftProbabilityAutoList.contains(_bindings._car.getType())))) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"low"));
        
		
		
		
	

	}
	// query: hasRating
	// rule: AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
	private static ResourceIterator<PotentialTheftRatingRel> hasRating_0 (final DerivationController _derivation ,  final Car car ,  final String rating ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC01", DerivationController.RULE, _annotations_AE_PTC01);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC01: _car.getConvertible() -> PotentialTheftRating(_car,"high");
		// prereqs: [_car.getConvertible()]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(rating,"high"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite _car.getConvertible()
		
		
		 // case 4
					if (!(_bindings._car.isConvertible())) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"high"));
        
		
		
		
	

	}
	// rule: AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
	private static ResourceIterator<PotentialTheftRatingRel> hasRating_1 (final DerivationController _derivation ,  final Car car ,  final String rating ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC02", DerivationController.RULE, _annotations_AE_PTC02);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC02: (_car.getPrice())>45000 -> PotentialTheftRating(_car,"high");
		// prereqs: [(_car.getPrice())>45000]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(rating,"high"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite (_car.getPrice())>45000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())>45000)) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"high"));
        
		
		
		
	

	}
	// rule: AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
	private static ResourceIterator<PotentialTheftRatingRel> hasRating_2 (final DerivationController _derivation ,  final Car car ,  final String rating ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC03", DerivationController.RULE, _annotations_AE_PTC03);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC03: highTheftProbabilityAutoList.contains(_car.getType()) -> PotentialTheftRating(_car,"high");
		// prereqs: [highTheftProbabilityAutoList.contains(_car.getType())]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private java.util.Collection highTheftProbabilityAutoList = PotentialTheftRatingRelInstances.highTheftProbabilityAutoList;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(rating,"high"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite highTheftProbabilityAutoList.contains(_car.getType())
		
		
		 // case 4
					if (!(_bindings.highTheftProbabilityAutoList.contains(_bindings._car.getType()))) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"high"));
        
		
		
		
	

	}
	// rule: AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
	private static ResourceIterator<PotentialTheftRatingRel> hasRating_3 (final DerivationController _derivation ,  final Car car ,  final String rating ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC04", DerivationController.RULE, _annotations_AE_PTC04);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC04: (_car.getPrice())>20000 & (_car.getPrice())<45000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"moderate");
		// prereqs: [(_car.getPrice())>20000, (_car.getPrice())<45000, !(highTheftProbabilityAutoList.contains(_car.getType()))]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private java.util.Collection highTheftProbabilityAutoList = PotentialTheftRatingRelInstances.highTheftProbabilityAutoList;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(rating,"moderate"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite (_car.getPrice())>20000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())>20000)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite (_car.getPrice())<45000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())<45000)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite !(highTheftProbabilityAutoList.contains(_car.getType()))
		
		
		 // case 4
					if (!(!(_bindings.highTheftProbabilityAutoList.contains(_bindings._car.getType())))) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"moderate"));
        
		
		
		
	

	}
	// rule: AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
	private static ResourceIterator<PotentialTheftRatingRel> hasRating_4 (final DerivationController _derivation ,  final Car car ,  final String rating ) {
		
		_derivation.log("PotentialTheftRating.AE_PTC05", DerivationController.RULE, _annotations_AE_PTC05);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: AE_PTC05: (_car.getPrice())<20000 & !(highTheftProbabilityAutoList.contains(_car.getType())) -> PotentialTheftRating(_car,"low");
		// prereqs: [(_car.getPrice())<20000, !(highTheftProbabilityAutoList.contains(_car.getType()))]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private java.util.Collection highTheftProbabilityAutoList = PotentialTheftRatingRelInstances.highTheftProbabilityAutoList;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(rating,"low"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite (_car.getPrice())<20000
		
		
		 // case 4
					if (!((_bindings._car.getPrice())<20000)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite !(highTheftProbabilityAutoList.contains(_car.getType()))
		
		
		 // case 4
					if (!(!(_bindings.highTheftProbabilityAutoList.contains(_bindings._car.getType())))) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PotentialTheftRatingRel(_bindings._car,"low"));
        
		
		
		
	

	}
	
	
	// methods representing aggregation functions
	
	
}


