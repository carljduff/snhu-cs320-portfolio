package module_three_milestone;
import java.util.ArrayList;

public class ContactService {
	
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	
	public boolean addContact(Contact contact) {
		boolean added = false;
		
		if(contactList.size() == 0) {
			contactList.add(contact);
			added = true;
		} else {
			for(Contact c : contactList) {
				if(contact.getContactID().equalsIgnoreCase(c.getContactID())) {
					return added;
				}
			}
			
			contactList.add(contact);
			added = true;
		}
		
		return added;
	}
	
	public boolean deleteContact(String id) {
		boolean deleted = false;
		
		for(Contact c : contactList) {
			if(c.getContactID().equalsIgnoreCase(id)) {
				int indx = contactList.indexOf(c);
				contactList.remove(indx);
				deleted = true;
				return deleted;
			}
		}
		
		return deleted;
	}
	
	public boolean updateContact(String id, String firstName, String lastName, String phoneNumber, String address) {
		boolean updated = false;
		
		for(Contact c : contactList) {
			if(c.getContactID().equalsIgnoreCase(id)) {
				c.setFirstName(firstName);
				c.setLastName(lastName);
				c.setPhoneNumber(phoneNumber);
				c.setAddress(address);
				
				updated = true;
				return updated;
			}
		}
		
		return updated;
	}
	
}
