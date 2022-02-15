package insurancepolicy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testMotorInsurancePolicy {
	
	// test data
	String surnameValidLow, surnameValidMid, surnameValidHigh;
	String surnameInvalidLow, surnameInvalidHigh;
	
	int ageValidLow, ageValidMid, ageValidHigh;
	int ageInvalidLow, ageInvalidHigh;
	
	MotorType car, bus, taxi;
	
	String policyIdValid, policyIdInvalid;
	
	MotorInsurancePolicy mPolicy;

	@BeforeEach
	void setUp() throws Exception {
		
		surnameValidLow = "ABC";
		surnameValidMid = "ABCDEFGHIJK";
		surnameValidHigh = "ABCDEFGHIJKLMNOPQRST"; // Length 20 chars
		surnameInvalidLow = "AB";
		surnameInvalidHigh = "ABCDEFGHIJKLMNOPQRSTU"; // Length 21 chars
		
		ageValidLow = 18;
		ageValidMid = 30;
		ageValidHigh = 50;
		ageInvalidLow = 17;
		ageInvalidHigh = 51;
		
		car = MotorType.CAR;
		bus = MotorType.BUS;
		taxi = MotorType.TAXI;
		
		policyIdValid = "";
		policyIdInvalid = "";
		
		mPolicy = new MotorInsurancePolicy();
		
	}

	@Test
	void testMotorInsurancePolicyDefault() {
		fail("Not yet implemented");
	}

	@Test
	void testMotorInsurancePolicyValidData() {
		MotorInsurancePolicy policy = new MotorInsurancePolicy(surnameValidLow, ageValidLow, car);
		assertNotNull(policy);
		assertEquals(surnameValidLow, policy.getSurname());
		assertEquals(ageValidLow, policy.getAge());
		assertEquals(car, policy.getMotorType());
		assertNotNull(policy.getPolicyId());
	}
	
	@Test
	void testMotorInsurancePolicyInvalidData() {
		assertThrows(IllegalArgumentException.class, ()->{
			new MotorInsurancePolicy(surnameInvalidLow, ageValidLow, car);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new MotorInsurancePolicy(surnameValidLow, ageInvalidLow, car);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new MotorInsurancePolicy(surnameValidLow, ageValidLow, null);
		});		
	}

	@Test
	void testGetSetMotorType() {
		mPolicy.setMotorType(car);
		assertEquals(car, mPolicy.getMotorType());
		
		mPolicy.setMotorType(bus);
		assertEquals(bus, mPolicy.getMotorType());
		
		mPolicy.setMotorType(taxi);
		assertEquals(taxi, mPolicy.getMotorType());
	}

	@Test
	void testSetMotorTypeNullException() {
		assertThrows(IllegalArgumentException.class, ()->{
			mPolicy.setMotorType(null);
		});
	}

	@Test
	void testGetPolicyId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSurname() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSurname() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAge() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAge() {
		fail("Not yet implemented");
	}

}
