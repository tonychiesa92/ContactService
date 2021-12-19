
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1234","Tony","Chiesa","5409076722","10105 Chatham Court");
		assertTrue(contact.getId().equals("1234"));
		assertTrue(contact.getFirstName().equals("Tony"));
		assertTrue(contact.getLastName().equals("Chiesa"));
		assertTrue(contact.getNumber().equals("5409076722"));
		assertTrue(contact.getAddress().equals("10105 Chatham Court"));
	}
	
	@Test
	void testConactIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234567890111","Tony","Chiesa","5409076722","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact (null,"Tony","Chiesa","5409076722","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","TonyTONYTONY","Chiesa","5409076722","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234",null,"Chiesa","5409076722","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony","ChiesaChiesa","5409076722","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony",null,"5409076722","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactNumberLengthToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony","Chiesa","1234567890111","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactNumberLengthToShort() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony","Chiesa","123","10105 Chatham Court");
		});
	}
	
	@Test
	void testConactNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony","Chiesa",null,"10105 Chatham Court");
		});
	}
	
	@Test
	void testConactAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony","Chiesa","123","10105 Chatham Court 10105 Chatham Court");
		});
	}
	
	@Test
	void testConactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("1234","Tony","Chiesa","5409076722",null);
		});
	}
}
