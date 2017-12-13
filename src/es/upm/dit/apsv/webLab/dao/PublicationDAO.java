/**
 * 
 */
package es.upm.dit.apsv.webLab.dao;

import es.upm.dit.apsv.webLab.dao.model.Publication;

/**
 * @author josemariacarmonaperez
 *
 */
public interface PublicationDAO {
	
	Publication create(Publication u);
	Publication update (Publication u);
	Publication read(Publication r);
	Publication delete(Publication u);

}
