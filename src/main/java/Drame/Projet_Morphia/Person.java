package Drame.Projet_Morphia;

import java.util.List;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IdGetter;
import org.mongodb.morphia.annotations.Transient;


@Entity
public class Person {
	
	@Id 
	private ObjectId id ;
	private String name;
	@Transient
	private Address listAddress ;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Address listAddress) {
		super();
		this.name = name;
		this.listAddress = listAddress;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getListAddress() {
		return listAddress;
	}

	public void setListAddress(Address address) {
		this.listAddress = address;
	}
	
	
	
}
