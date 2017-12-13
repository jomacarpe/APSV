package es.upm.dit.apsv.webLab.dao.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Researcher implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String email;
	private String affiliation; 
	private String password;
	@ManyToMany (fetch = FetchType.EAGER, mappedBy="authors", cascade= {CascadeType.MERGE, CascadeType.PERSIST})
	private Collection<Publication> pubs;
	
	public Researcher() {}
	
	public Researcher(String string, String string2, String string3, String string4, String string5) {
		super();
		id = string;
		name = string2;
		email = string3;
		affiliation = string4;
		password = string5;
		this.pubs = new ArrayList<>();
		
	}

	/*public Researcher(String id, String email, String affiliation, String name, Collection<Publication> pubs, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.affiliation = affiliation;
		this.password = password;
		this.pubs = pubs;
	}*/
	
	@Override
	public String toString() {
		return "Researcher [id=" + id + ", name=" + name + ", email=" + email + ", affiliation=" + affiliation
				+ ", password=" + password + ", collection_publication=" + pubs + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getAffiliation()="
				+ getAffiliation() + ", getPassword()=" + getPassword() + ", getCollection_publication()="
				+ getPubs() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Publication> getPubs() {
		return pubs;
	}

	public void setPubs(Collection<Publication> pubs) {
		this.pubs = pubs;
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
