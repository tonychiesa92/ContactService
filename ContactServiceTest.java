
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddNewContact() {      
        ContactService cs = new ContactService();
        Contact test1 = new Contact("1234","Tony","Chiesa","5409076722","10105 Chatham Court");
		assertEquals(true,cs.addContact(test1));
		
		
	}
	
	@Test
	void testDeleteContact() {     
        
        ContactService cs = new ContactService();
        Contact test1 = new Contact("1234","Tony","Chiesa","5409076722","10105 Chatham Court");
        Contact test2 = new Contact("2222", "Bob", "Happy", "2276709045", "321 Happy Street");
        Contact test3 = new Contact("3333", "Jo", "Rabbit", "1234567890", "987 Rabbit Hole Circle");
        
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);
        
        assertEquals(true,cs.deleteContact("1234"));
        assertEquals(true,cs.deleteContact("2222"));
        assertEquals(true,cs.deleteContact("3333"));
        
        
		
	}
	
	@Test
	void testUpdateContact() {
		ContactService cs = new ContactService();
        Contact test1 = new Contact("1234","Tony","Chiesa","5409076722","10105 Chatham Court");
        Contact test2 = new Contact("2222", "Bob", "Happy", "2276709045", "321 Happy Street");
        Contact test3 = new Contact("3333", "Jo", "Rabbit", "1234567890", "987 Rabbit Hole Circle");
        
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);
        
        assertEquals(true,cs.updateContact("1234", "TonyFirstName", "ChiesalastName", "5409076722", "10105 Chatham Court"));
        assertEquals(false,cs.updateContact("1234", "TonyFirstName", "ChiesalastName", "5409076722", "10105 Chatham Court");)
	}

}
