package org.mandarax.examples.userv.rules.generated;
 
import org.mandarax.examples.userv.domain.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>PolicyEligibilityScore</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Nov 21, 2010 9:48:17 PM 
 */
public class PolicyEligibilityScoreRelInstances {
	// object references
	
	
	// fields representing annotations
	
	// rule: ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
	private final static java.util.Properties _annotations_ES_01a = new java.util.Properties();
	
	// rule: ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
	private final static java.util.Properties _annotations_ES_01b = new java.util.Properties();
	
	// rule: ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
	private final static java.util.Properties _annotations_ES_02a = new java.util.Properties();
	
	// rule: ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
	private final static java.util.Properties _annotations_ES_02b = new java.util.Properties();
	
	// rule: ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
	private final static java.util.Properties _annotations_ES_02c = new java.util.Properties();
	
	// rule: ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
	private final static java.util.Properties _annotations_ES_03a = new java.util.Properties();
	
	// rule: ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
	private final static java.util.Properties _annotations_ES_03b = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
		_annotations_ES_01a.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_01a.put("author","Jens Dietrich");
		_annotations_ES_01a.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
		_annotations_ES_01a.put("description","If car is Not Eligible then increase policy eligibility score by 100");
		
		
	
		// relationship annotations for rule  ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
		_annotations_ES_01b.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_01b.put("author","Jens Dietrich");
		_annotations_ES_01b.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
		_annotations_ES_01b.put("description","If car is Provisional then increase policy eligibility score by 50");
		
		
	
		// relationship annotations for rule  ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
		_annotations_ES_02a.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_02a.put("author","Jens Dietrich");
		_annotations_ES_02a.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
		
		
	
		// relationship annotations for rule  ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
		_annotations_ES_02b.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_02b.put("author","Jens Dietrich");
		_annotations_ES_02b.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
		
		
	
		// relationship annotations for rule  ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
		_annotations_ES_02c.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_02c.put("author","Jens Dietrich");
		_annotations_ES_02c.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
		_annotations_ES_02c.put("description","If driver is High Risk Driver then increase policy eligibility score by 100");
		
		
	
		// relationship annotations for rule  ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
		_annotations_ES_03a.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_03a.put("author","Jens Dietrich");
		_annotations_ES_03a.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
		_annotations_ES_03a.put("description","If client is Preferred then reduce policy eligibility score by 50");
		
		
	
		// relationship annotations for rule  ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
		_annotations_ES_03b.put("category","Eligibility Scoring Rule Set");
		_annotations_ES_03b.put("author","Jens Dietrich");
		_annotations_ES_03b.put("lastupdated","19/11/10");
		
		// rule annotations for rule  ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
		_annotations_ES_03b.put("description","If client is Elite then reduce policy eligibility score by 100");
		
		
	}
		
	

	// interface generated for queries	
	 
	public static ResultSet<PolicyEligibilityScoreRel> getScore (  Car car ,  Driver driver  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<PolicyEligibilityScoreRel>(getScore ( _derivation ,  car ,  driver ),_derivation);
	} 
	 
	public static ResultSet<PolicyEligibilityScoreRel> hasScore (  Car car ,  Driver driver ,  int score  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<PolicyEligibilityScoreRel>(hasScore ( _derivation ,  car ,  driver ,  score ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<PolicyEligibilityScoreRel> getScore ( final DerivationController _derivation ,  final Car car ,  final Driver driver  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<PolicyEligibilityScoreRel>(7) {
			
			public ResourceIterator<PolicyEligibilityScoreRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
                			return getScore_0(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
                		case 1: {
                			// invoke ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
                			return getScore_1(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
                		case 2: {
                			// invoke ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
                			return getScore_2(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
                		case 3: {
                			// invoke ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
                			return getScore_3(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
                		case 4: {
                			// invoke ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
                			return getScore_4(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
                		case 5: {
                			// invoke ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
                			return getScore_5(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
                		case 6: {
                			// invoke ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
                			return getScore_6(_derivation.pop(_derivationlevel) ,  car ,  driver );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<PolicyEligibilityScoreRel> hasScore ( final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<PolicyEligibilityScoreRel>(7) {
			
			public ResourceIterator<PolicyEligibilityScoreRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
                			return hasScore_0(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
                		case 1: {
                			// invoke ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
                			return hasScore_1(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
                		case 2: {
                			// invoke ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
                			return hasScore_2(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
                		case 3: {
                			// invoke ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
                			return hasScore_3(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
                		case 4: {
                			// invoke ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
                			return hasScore_4(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
                		case 5: {
                			// invoke ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
                			return hasScore_5(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
                		case 6: {
                			// invoke ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
                			return hasScore_6(_derivation.pop(_derivationlevel) ,  car ,  driver ,  score );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getScore
	// rule: ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_0 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_01a", DerivationController.RULE, _annotations_ES_01a);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
		// prereqs: [AutoEligibility(_car,"not eligible")]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite AutoEligibility(_car,"not eligible")
		
		
		 // case 4
					
					_tmp = AutoEligibilityRelInstances.getRating(_derivation.push(),_bindings._car);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,100));
        
		
		
		
	

	}
	// rule: ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_1 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_01b", DerivationController.RULE, _annotations_ES_01b);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
		// prereqs: [AutoEligibility(_car,"provisional")]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite AutoEligibility(_car,"provisional")
		
		
		 // case 4
					
					_tmp = AutoEligibilityRelInstances.getRating(_derivation.push(),_bindings._car);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,50));
        
		
		
		
	

	}
	// rule: ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_2 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_02a", DerivationController.RULE, _annotations_ES_02a);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
		// prereqs: [DriverCategory(_driver,"young driver"), not IsEligible(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite DriverCategory(_driver,"young driver")
		
		
		 // case 4
					
					_tmp = DriverCategoryRelInstances.getCategory(_derivation.push(),_bindings._driver);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		 
		
		
		
		// apply prerequisite not IsEligible(_driver)
		
		
		 // case 4
					
					_tmp = IsEligibleRelInstances.isEligible(_derivation.push(),_bindings._driver);
					
					if (_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,30));
        
		
		
		
	

	}
	// rule: ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_3 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_02b", DerivationController.RULE, _annotations_ES_02b);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
		// prereqs: [DriverCategory(_driver,"senior driver"), not IsEligible(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite DriverCategory(_driver,"senior driver")
		
		
		 // case 4
					
					_tmp = DriverCategoryRelInstances.getCategory(_derivation.push(),_bindings._driver);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		 
		
		
		
		// apply prerequisite not IsEligible(_driver)
		
		
		 // case 4
					
					_tmp = IsEligibleRelInstances.isEligible(_derivation.push(),_bindings._driver);
					
					if (_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,20));
        
		
		
		
	

	}
	// rule: ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_4 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_02c", DerivationController.RULE, _annotations_ES_02c);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
		// prereqs: [IsHighRiskDriver(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite IsHighRiskDriver(_driver)
		
		
		 // case 4
					
					_tmp = IsHighRiskDriverRelInstances.isHighRiskDriver(_derivation.push(),_bindings._driver);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,100));
        
		
		
		
	

	}
	// rule: ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_5 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_03a", DerivationController.RULE, _annotations_ES_03a);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
		// prereqs: [client.getIsPreferred()]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver client = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite client.getIsPreferred()
		
		
		 // case 4
					if (!(_bindings.client.isPreferred())) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings.client,-50));
        
		
		
		
	

	}
	// rule: ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
	private static ResourceIterator<PolicyEligibilityScoreRel> getScore_6 (final DerivationController _derivation ,  final Car car ,  final Driver driver ) {
		
		_derivation.log("PolicyEligibilityScore.ES_03b", DerivationController.RULE, _annotations_ES_03b);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
		// prereqs: [client.getIsElite()]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver client = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite client.getIsElite()
		
		
		 // case 4
					if (!(_bindings.client.isElite())) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings.client,-100));
        
		
		
		
	

	}
	// query: hasScore
	// rule: ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_0 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_01a", DerivationController.RULE, _annotations_ES_01a);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_01a: AutoEligibility(_car,"not eligible") -> PolicyEligibilityScore(_car,_driver,100);
		// prereqs: [AutoEligibility(_car,"not eligible")]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,100); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite AutoEligibility(_car,"not eligible")
		
		
		 // case 4
					
					_tmp = AutoEligibilityRelInstances.getRating(_derivation.push(),_bindings._car);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,100));
        
		
		
		
	

	}
	// rule: ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_1 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_01b", DerivationController.RULE, _annotations_ES_01b);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_01b: AutoEligibility(_car,"provisional") -> PolicyEligibilityScore(_car,_driver,50);
		// prereqs: [AutoEligibility(_car,"provisional")]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,50); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite AutoEligibility(_car,"provisional")
		
		
		 // case 4
					
					_tmp = AutoEligibilityRelInstances.getRating(_derivation.push(),_bindings._car);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,50));
        
		
		
		
	

	}
	// rule: ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_2 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_02a", DerivationController.RULE, _annotations_ES_02a);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_02a: DriverCategory(_driver,"young driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,30);
		// prereqs: [DriverCategory(_driver,"young driver"), not IsEligible(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,30); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite DriverCategory(_driver,"young driver")
		
		
		 // case 4
					
					_tmp = DriverCategoryRelInstances.getCategory(_derivation.push(),_bindings._driver);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		 
		
		
		
		// apply prerequisite not IsEligible(_driver)
		
		
		 // case 4
					
					_tmp = IsEligibleRelInstances.isEligible(_derivation.push(),_bindings._driver);
					
					if (_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,30));
        
		
		
		
	

	}
	// rule: ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_3 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_02b", DerivationController.RULE, _annotations_ES_02b);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_02b: DriverCategory(_driver,"senior driver") & not IsEligible(_driver) -> PolicyEligibilityScore(_car,_driver,20);
		// prereqs: [DriverCategory(_driver,"senior driver"), not IsEligible(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,20); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite DriverCategory(_driver,"senior driver")
		
		
		 // case 4
					
					_tmp = DriverCategoryRelInstances.getCategory(_derivation.push(),_bindings._driver);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		 
		
		
		
		// apply prerequisite not IsEligible(_driver)
		
		
		 // case 4
					
					_tmp = IsEligibleRelInstances.isEligible(_derivation.push(),_bindings._driver);
					
					if (_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,20));
        
		
		
		
	

	}
	// rule: ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_4 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_02c", DerivationController.RULE, _annotations_ES_02c);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_02c: IsHighRiskDriver(_driver) -> PolicyEligibilityScore(_car,_driver,100);
		// prereqs: [IsHighRiskDriver(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,100); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite IsHighRiskDriver(_driver)
		
		
		 // case 4
					
					_tmp = IsHighRiskDriverRelInstances.isHighRiskDriver(_derivation.push(),_bindings._driver);
					
					if (!_tmp.hasNext()) {
						_tmp.close();
						return EmptyIterator.DEFAULT;
					}
					
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings._driver,100));
        
		
		
		
	

	}
	// rule: ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_5 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_03a", DerivationController.RULE, _annotations_ES_03a);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_03a: client.getIsPreferred() -> PolicyEligibilityScore(_car,client,-50);
		// prereqs: [client.getIsPreferred()]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver client = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,-50); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite client.getIsPreferred()
		
		
		 // case 4
					if (!(_bindings.client.isPreferred())) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings.client,-50));
        
		
		
		
	

	}
	// rule: ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
	private static ResourceIterator<PolicyEligibilityScoreRel> hasScore_6 (final DerivationController _derivation ,  final Car car ,  final Driver driver ,  final int score ) {
		
		_derivation.log("PolicyEligibilityScore.ES_03b", DerivationController.RULE, _annotations_ES_03b);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: ES_03b: client.getIsElite() -> PolicyEligibilityScore(_car,client,-100);
		// prereqs: [client.getIsElite()]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Car _car = car;
			private org.mandarax.examples.userv.domain.Driver client = driver;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		
		
		
		
		_checkfailed = _checkfailed || !Equals.compare(score,-100); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		 
		
		
		
		// apply prerequisite client.getIsElite()
		
		
		 // case 4
					if (!(_bindings.client.isElite())) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new PolicyEligibilityScoreRel(_bindings._car,_bindings.client,-100));
        
		
		
		
	

	}
	
	
	// methods representing aggregation functions
	
	
}


