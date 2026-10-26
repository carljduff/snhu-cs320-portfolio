package module_three_milestone;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid name.");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid name.");
		}
		
		if(phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid Phone Number.");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setFirstName(String name) {
		if(name == null || name.length() > 10) {
			throw new IllegalArgumentException("Invalid name.");
		}
		
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		if(name == null || name.length() > 10) {
			throw new IllegalArgumentException("Invalid name.");
		}
		
		this.lastName = name;
	}
	
	public void setPhoneNumber(String phone) {
		if(phone == null ||  !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid Phone Number.");
		}
		
		this.phoneNumber = phone;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		
		this.address = address;
	}
	
	
}