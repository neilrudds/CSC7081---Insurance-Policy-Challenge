package insurancepolicy;

import java.util.ArrayList;

public class PolicySearch {
	
	public static ArrayList<GenericInsurancePolicy> searchByAge(ArrayList<GenericInsurancePolicy> policies, int ageLower, int ageUpper) {
		
		ArrayList<GenericInsurancePolicy> searchResults = new ArrayList<GenericInsurancePolicy>();
		
		for (GenericInsurancePolicy policy : policies) {
			if (policy.getAge() >= ageLower && policy.getAge() <= ageUpper) {
				searchResults.add(policy);
			}
		}
		return searchResults;
	}
	
	public static ArrayList<MotorInsurancePolicy> searchByMotorType(ArrayList<MotorInsurancePolicy> policies, MotorType motorType) {
			
			ArrayList<MotorInsurancePolicy> searchResults = new ArrayList<MotorInsurancePolicy>();
			
			for (MotorInsurancePolicy policy : policies) {
				if (policy.getMotorType() == motorType) {
					searchResults.add(policy);
				}
			}
			return searchResults;
		}

}