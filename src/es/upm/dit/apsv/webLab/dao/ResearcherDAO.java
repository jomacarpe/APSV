/**
 * 
 */
package es.upm.dit.apsv.webLab.dao;
import java.util.Collection;
import java.util.List;

import es.upm.dit.apsv.webLab.model.Researcher;

/**
 * @author josemariacarmonaperez
 *
 */
public interface ResearcherDAO {

	Researcher create(Researcher u);
	Researcher update(Researcher u);
	//Researcher read(Researcher u);
	Researcher delete(Researcher u);
	Researcher read(String id);
	List<Researcher> readAll();
	

}
