package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Producer {
	private String firstName;
	private String lastName;
	private String age;
	public Producer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producer(String firstName, String lastName, String age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Producer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
	
