
public class Patient extends Partner{
	private String firstName;
	private String lastName;
	private String middleInital;
	private String title;
	
	public String getPartnerName(){
		return this.getFirstName() + " " + this.getMiddleInital() + " " + this.getLastName();
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

	public String getMiddleInital() {
		return middleInital;
	}

	public void setMiddleInital(String middleInital) {
		this.middleInital = middleInital;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
