
public class Contact {

	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	private String id;
	
	public Contact(String id, String firstName,String lastName, String Number, String Address) {
		if(id==null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(firstName==null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName==null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(Number==null || Number.length()!=10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		if(Address==null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Number=Number;
		this.Address=Address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return Number;
	}
	public String getAddress() {
		return Address;
	}
	
	public String getId() {
		return id;
	}
}
