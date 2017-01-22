package Drame.Projet_Morphia;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Transient;

@Entity
public class Address {
	
	@Id
	private String street ;
	private String city;
	private String postCode ;
	private String country;
	@Transient
	private Person personne;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String postCode, String country, Person personne) {
		super();
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.country = country;
		this.personne = personne;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Person getPersonne() {
		return personne;
	}
	
	public void setPersonne(Person personne) {
		this.personne = personne;
	}
	
}
