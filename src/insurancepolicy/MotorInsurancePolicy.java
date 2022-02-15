/**
 * 
 */
package insurancepolicy;

import java.util.Calendar;

/**
 * @author neilr
 *
 */
public class MotorInsurancePolicy extends GenericInsurancePolicy {

	private MotorType motorType;
	private String policyId;
	
	/**
	 * Default Constructor
	 */
	public MotorInsurancePolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor with arguments
	 * @param surname
	 * @param age
	 * @param motorType
	 */
	public MotorInsurancePolicy(String surname, int age, MotorType motorType) {
		super(surname, age);
		this.setMotorType(motorType);
		try {
			this.generatePolicyId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setMotorType(MotorType motorType) {
		this.motorType = motorType;
	}
	/**
	 * @return the motorType
	 */
	public MotorType getMotorType() {
		return motorType;
	}
	/**
	 * @return the policyId
	 */
	public String getPolicyId() {
		return policyId;
	}
	
	private void generatePolicyId() {
		if (getSurname().length() >= 3) {
			this.policyId = this.getSurname().substring(0, 3) + this.getTimeStampWithParity();
		} else {
			// Not long enough, to-do
		}
	}
	
	private String getTimeStampWithParity() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		// sum of the year and month
		int timeStamp = year + month;
		int parity = timeStamp % 2;
		return Integer.toString(timeStamp) + Integer.toString(parity);
	}
	
	@Override
	public void setSurname(String surname) {
		super.setSurname(surname);
		this.generatePolicyId(); // Regenerate the policyId
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.printf("Policy Id: %s\n", getPolicyId());
		System.out.printf("Motor Type: %s\n", getMotorType());
	}
	
	
}
