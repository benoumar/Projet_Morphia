package Drame.Projet_Morphia;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Transient;

@Entity
public class Article {
	
	@Id
	private ObjectId id ;
	private String name;
	private int stars;
	@Transient
	private List<Person> listPerson;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(ObjectId id, String name, int stars, List<Person> listPerson1) {
		super();
		this.id = id;
		this.name = name;
		this.stars = stars;
		listPerson = listPerson1;
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

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public List<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(List<Person> listPerson) {
		this.listPerson = listPerson;
	}	
	
	
}
