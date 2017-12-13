package es.upm.dit.apsv.webLab.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Researcher implements Serializable {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String affiliation;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="authors", cascade= {CascadeType.MERGE, CascadeType.PERSIST})
	private Collection<Publication> pubs;

	public Researcher() {
		this.pubs = new ArrayList<Publication> ();		
	}
	
	public Researcher(String id, String name, String email, String affiliation){
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.affiliation = affiliation;
		this.pubs = new ArrayList<Publication> ();
	}

	public Researcher(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Researcher [id=" + id + ", name=" + name + ", email=" + email + ", affiliation=" + affiliation
				+ ", password=" + password + ", pubs=" + pubs.stream().map(s->s.getTitle()).collect(Collectors.toList()) + "]";
	}



}
