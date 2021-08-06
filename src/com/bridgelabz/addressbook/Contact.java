package com.bridgelabz.addressbook;

import java.util.List;
import java.util.Objects;

import com.opencsv.bean.CsvBindByPosition;

public class Contact {
	private int id;
	@CsvBindByPosition(position = 0)
	 private String firstName;
	@CsvBindByPosition(position = 1)
	 private String lastname;
	@CsvBindByPosition(position = 2)
	 private String address;
	@CsvBindByPosition(position = 3)
	 private String city;
	@CsvBindByPosition(position = 4)
	 private String state;
	@CsvBindByPosition(position = 5)
	 private String zip;
	@CsvBindByPosition(position = 6)
	 private int phoneNumber;
	@CsvBindByPosition(position = 7)
	 private String email;
	private List<String> groups;
	
	public Contact() {
		super();
	
	}

	public Contact(int id, String firstName, String lastname, String address, String city, String state, String zip,
			int phoneNumber, String email, List<String> groups) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.groups = groups;
	}



	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", groups=" + groups + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<String> getGroups() {
		return groups;
	}

	public void setGroups(List<String> groups) {
		this.groups = groups;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(groups, other.groups) && id == other.id && Objects.equals(lastname, other.lastname)
				&& phoneNumber == other.phoneNumber && Objects.equals(state, other.state)
				&& Objects.equals(zip, other.zip);
	}
}
