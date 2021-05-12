package Entities;

import java.util.Date;

public class Player implements BaseEntity {
	
	private int playerId;
	private String firstName;
	private String lastName;
	private String email;
	private long nationaltyIdNumber;
	private int dateOfBirth;
	
	public Player() {
		
	}

	public Player(int playerId, String firstName, String lastName, String email, long nationaltyIdNumber,
			int dateOfBirth) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationaltyIdNumber = nationaltyIdNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNationaltyIdNumber() {
		return nationaltyIdNumber;
	}

	public void setNationaltyIdNumber(long nationaltyIdNumber) {
		this.nationaltyIdNumber = nationaltyIdNumber;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(int i, int j, int k) {
		
		
	}
	

}
