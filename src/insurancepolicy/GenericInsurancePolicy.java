/**
 * 
 */
package insurancepolicy;

/**
 * @author neilr
 *
 */
public abstract class GenericInsurancePolicy {
	
	private String surname;
	private int age;
	
	public GenericInsurancePolicy() {
		
	}
	
	public GenericInsurancePolicy(String surname, int age) {
		this.setSurname(surname);
		this.setAge(age);
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayAll() {
		System.out.println("--- Insurance Policy ---");
		System.out.printf("Surname: %s\n", getSurname());
		System.out.printf("Age: %d\n", getAge());
	}
		
}
