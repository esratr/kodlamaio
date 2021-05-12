package Entities;

public class Customer {
	private int id;
	private String name;
	private String lastName;
	private int dateOfBirth;
	private String nationaltyIdNumber;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String lastName, int dateOfBirth, String nationaltyIdNumber) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltyIdNumber = nationaltyIdNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationaltyIdNumber() {
		return nationaltyIdNumber;
	}

	public void setNationaltyIdNumber(String nationaltyIdNumber) {
		this.nationaltyIdNumber = nationaltyIdNumber;
	}
	
	

}
