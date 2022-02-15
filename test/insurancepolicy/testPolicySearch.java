package insurancepolicy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPolicySearch {
	
	ArrayList<GenericInsurancePolicy> genericPolicies = new ArrayList<GenericInsurancePolicy>();
	ArrayList<MotorInsurancePolicy> motorPolicies = new ArrayList<MotorInsurancePolicy>();
	
	MotorInsurancePolicy policy1 = new MotorInsurancePolicy("McDonald", 27, MotorType.CAR);
	MotorInsurancePolicy policy2 = new MotorInsurancePolicy("Bloggs", 18, MotorType.TAXI);
	MotorInsurancePolicy policy3 = new MotorInsurancePolicy("Irwin", 31, MotorType.BUS);
	MotorInsurancePolicy policy4 = new MotorInsurancePolicy("Foster", 35, MotorType.CAR);
	MotorInsurancePolicy policy5 = new MotorInsurancePolicy("Bush", 19, MotorType.TAXI);
	MotorInsurancePolicy policy6 = new MotorInsurancePolicy("Clelland", 44, MotorType.TAXI);
		
	@BeforeEach
	void setUp() throws Exception {
		
		// Setup the GenericPolicies ArrayList
		genericPolicies.add(policy1);
		genericPolicies.add(policy2);
		genericPolicies.add(policy3);
		genericPolicies.add(policy4);
		genericPolicies.add(policy5);
		genericPolicies.add(policy6);
		
		// Setup the MotorPolicies ArrayList
		motorPolicies.add(policy1);
		motorPolicies.add(policy2);
		motorPolicies.add(policy3);
		motorPolicies.add(policy4);
		motorPolicies.add(policy5);
		motorPolicies.add(policy6);
	}

	@Test
	void testSearchByAge() {
		// invoke the search
	    ArrayList<GenericInsurancePolicy> returnedSearchByAge = PolicySearch.searchByAge(genericPolicies, 15, 30);

	    // should return three motor policies
	    System.out.println(returnedSearchByAge.size());

	    // could check the numbers returned and the exact object matches
	    if (returnedSearchByAge.size() == 3 && returnedSearchByAge.contains(policy2) 
	    		&& returnedSearchByAge.contains(policy5) && returnedSearchByAge.contains(policy1)) {
	        assertTrue(true);
	    } else {
	        assertTrue(false);
	    }
	}

	@Test
	void testSearchByMotorType() {
		// invoke the search
	    ArrayList<MotorInsurancePolicy> returnedSearchByMotorType = PolicySearch.searchByMotorType(motorPolicies, MotorType.TAXI);

	    // should return three motor policies
	    System.out.println(returnedSearchByMotorType.size());

	    // could check the numbers returned and the exact object matches
	    if (returnedSearchByMotorType.size() == 3 && returnedSearchByMotorType.contains(policy2) 
	    		&& returnedSearchByMotorType.contains(policy5) && returnedSearchByMotorType.contains(policy6)) {
	        assertTrue(true);
	    } else {
	        assertTrue(false);
	    }
	}

}