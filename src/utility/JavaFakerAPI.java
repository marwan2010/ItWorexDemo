package utility;


import tests.TestBase;

public class JavaFakerAPI extends TestBase {

	
	public String getFirstName() {
		//Generating the first name
		String firstName = faker.name().firstName();
		return firstName;
	}

	public String getLastName() {
		//Generating last name
		String lastName = faker.name().lastName();
		return lastName;
	}
	
	public String getCompanyName() {
		//Generating last name
		String companyName = faker.company().name();
		return companyName;
	}
	
	public String getCityName() {
		//Generating last name
		String cityName = faker.address().cityName();
		return cityName;
	}
	
	public String getaddress() {
		//Generating last name
		String getaddress = faker.address().streetAddress();
		return getaddress;
	}
	
	public String getzipcode(String egypt) {
		//Generating last name
		String getzipcode = faker.address().countyByZipCode(egypt);
		
		return getzipcode;
	}
	
	
	public String getphoneNumber() {
		//Generating the phoneNumber
		String getphoneNumber = faker.phoneNumber().cellPhone().trim();
		return getphoneNumber;
	}
	

	public String getEmailID() {
		//Generating email Id
		String emailId = faker.internet().emailAddress();
		return emailId;
	}

	public String getPassword() {
		//Generating password
		String pwd = faker.internet().password();		
		return pwd;
	}
	
	public String getdescription() {
		//Generating password
		String pargh = faker.lorem().paragraph();	
		
		return pargh;
	}
	public String getSKUCode() {
		//Generating password
		String pargh = faker.idNumber().ssnValid();	
		
		return pargh;
	}
	
	public String getPtice() {
		//Generating password
		String price = faker.commerce().price(100, 5000);
		
		return price;
	}
	
	public String getidNumber() {
		//Generating password
		String id = faker.number().digits(5);
		return id;
		
		
	}
	
	public String get_phone_number() {
		//Generating password
		String id = faker.number().digits(9);
		return id;
		
		
	}
	
}
