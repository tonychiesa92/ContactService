import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {

	private static ArrayList<Contact> contactList = new ArrayList<Contact>();	
	
 // Adds contact to a list for testing
    public static void initializeContactList() {
        Contact contact1 = new Contact("1111", "Tony", "Chiesa", "5409076722", "10105 Chatham Court");
        Contact contact2 = new Contact("2222", "Bob", "Happy", "2276709045", "321 Happy Street");
        Contact contact3 = new Contact("3333", "Jo", "Rabbit", "1234567890", "987 Rabbit Hole Circle");
        
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
    }

	
	// add contact with unique ID
    public void addContact(String id, String firstName,String lastName, String Number, String Address) {
        
    	// check to see if Contact ID already exists
    	for(Contact contact: contactList) {
            if(contact.getId().equalsIgnoreCase(id)) {
            	return; 
            }
        }
        
        Contact newContact = new Contact(id,firstName,lastName,Number,Address);
        contactList.add(newContact);
    }
	
	// delete contact per contact ID
    public static void deleteContact(String id) {
        
    	// check to see if Contact ID already exists
    	for(Contact contact: contactList) {
            if(contact.getId().equalsIgnoreCase(id)) {
            	contactList.remove(id);
            	return;
            }
        }
    }
	
	// update contact field per contact ID
	// The following fields are able to be updated: firestName, lastName, Number, Address
    public static void updateContact(String id, String firstName,String lastName, String Number, String Address) {
    	int cntr=0;
    	
    	// check to see if Contact ID already exists
    	for(Contact contact: contactList) {
    		
            if(contact.getId().equalsIgnoreCase(id)) {
            	contactList.set(cntr,new Contact(id,firstName,lastName,Number,Address));
            	return;
            }
            cntr++;
        }       
    }

	public Object addContact;	
}
