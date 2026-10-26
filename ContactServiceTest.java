package module_three_milestone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();

		Contact contact = new Contact("12345","Jordan","Duff","8591234567","123 Main Street");
		
		assertTrue(service.addContact(contact));
	}

	@Test
	void testAddDuplicateContact() {
		ContactService service = new ContactService();

		Contact contact1 = new Contact("12345","Jordan","Duff","8591234567","123 Main Street");
		Contact contact2 = new Contact("12345","John","Smith","8595551234","456 Main Street");

		assertTrue(service.addContact(contact1));
		assertFalse(service.addContact(contact2));
	}

	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();

		Contact contact = new Contact("12345","Jordan","Duff","8591234567","123 Main Street");

		service.addContact(contact);

		assertTrue(service.deleteContact("12345"));
		assertFalse(service.deleteContact("12345"));
	}

	@Test
	void testUpdateContact() {
		ContactService service = new ContactService();

		Contact contact = new Contact("12345","Jordan","Duff","8591234567","123 Main Street");

		service.addContact(contact);

		assertTrue(service.updateContact("12345","Carl","Jones","8595551234","456 New Street"));

		assertEquals("Carl", contact.getFirstName());
		assertEquals("Jones", contact.getLastName());
		assertEquals("8595551234", contact.getPhoneNumber());
		assertEquals("456 New Street", contact.getAddress());
		assertEquals("12345", contact.getContactID());
	}
	
	@Test
	void testUpdateContactNotFound() {
		ContactService service = new ContactService();

		Contact contact = new Contact("12345","Jordan","Duff","8591234567","123 Main Street");

		service.addContact(contact);

		assertFalse(service.updateContact("99999","Carl","Jones","8595551234","456 New Street"));
	}
}