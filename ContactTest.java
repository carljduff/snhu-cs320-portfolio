package module_three_milestone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345","Jordan","Duff","8591234567","123 Main Street");

		assertEquals("12345", contact.getContactID());
		assertEquals("Jordan", contact.getFirstName());
		assertEquals("Duff", contact.getLastName());
		assertEquals("8591234567", contact.getPhoneNumber());
		assertEquals("123 Main Street", contact.getAddress());
	}

	@Test
	void testContactIDTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901","Jordan","Duff","8591234567","123 Main Street");
		});
	}

	@Test
	void testContactIDNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					null,"Jordan","Duff","8591234567","123 Main Street");
		});
	}

	@Test
	void testFirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","JordanJordan","Duff","8591234567","123 Main Street");
		});
	}

	@Test
	void testFirstNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345",null,"Duff","8591234567","123 Main Street");
		});
	}

	@Test
	void testLastNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan","DuffDuffDuff","8591234567","123 Main Street");
		});
	}

	@Test
	void testLastNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan",null,"8591234567","123 Main Street");
		});
	}

	@Test
	void testInvalidPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan","Duff","12345","123 Main Street");
		});
	}

	@Test
	void testPhoneNumberNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan","Duff",null,"123 Main Street");
		});
	}
	
	@Test
	void testPhoneNumberContainsLetters() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan","Duff","859ABC4567","123 Main Street");
		});
	}

	@Test
	void testAddressTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan","Duff","8591234567","1234567890123456789012345678901");
		});
	}

	@Test
	void testAddressNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345","Jordan","Duff","8591234567",null);
		});
	}
}
