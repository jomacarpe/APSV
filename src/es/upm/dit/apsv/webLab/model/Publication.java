/**
 * 
 */
package es.upm.dit.apsv.webLab.model;

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
public class Publication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String tittle;
	private int citeCount;
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Collection<Researcher> authors;
	
	public Publication() {
		// TODO Auto-generated constructor stub
	}
	
	public Publication(String id, String tittle, int citeCount) {
		
		this.id=id;
		this.tittle=tittle;
		this.citeCount=citeCount;
		this.authors= new ArrayList<>();
		
	}
	
//	public Publication(String id, String tittle, int citeCount, Collection<Researcher> authors) {
//		super();
//		this.id = id;
//		this.tittle = tittle;
//		this.citeCount = citeCount;
//		this.authors = authors;
//	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", tittle=" + tittle + ", citeCount=" + citeCount + ", collection_researcher="
				+ authors + ", getId()=" + getId() + ", getTittle()=" + getTittle() + ", getCiteCount()="
				+ getCiteCount() + ", getCollection_researcher()=" + getAuthors() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getCiteCount() {
		return citeCount;
	}

	public void setCiteCount(int citeCount) {
		this.citeCount = citeCount;
	}

	public Collection<Researcher> getAuthors() {
		return authors;
	}

	public void setAuthors(Collection<Researcher> authors) {
		this.authors = authors;
	}

}
