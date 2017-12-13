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
	@Id
	private String id;
	private String title;
	private int citeCount;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Collection<Researcher> authors;
	
	public Publication(String id, String title, int citeCount) {
		super();
		this.id = id;
		this.title = title;
		this.citeCount = citeCount;
		this.authors = new ArrayList<Researcher> ();
	}
	
	public Publication() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "Publication [id=" + id + ", title=" + title + ", citeCount=" + citeCount + "]";
	}
	
}
