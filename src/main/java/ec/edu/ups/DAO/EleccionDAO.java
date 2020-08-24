package ec.edu.ups.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.edu.ups.modelo.Elecciones;

@Stateless
public class EleccionDAO {
	
	@PersistenceContext(name = "ExamenRecuperacionServidorPersistenceUnit")  
	private EntityManager em;
	
	public void insert(Elecciones c) {
		em.persist(c);
	}
	
	public Elecciones read(String cedula) {
		return em.find(Elecciones.class, cedula);
	} 
	
	public List<Elecciones>listarEleccion(){
			String jpql = "SELECT c FROM Elecciones c ";

			Query q = em.createQuery(jpql, Elecciones.class);
			return q.getResultList();
		} 
		
	
}
