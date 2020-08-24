package ec.edu.ups.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.modelo.Elecciones;

@Stateless
public class CandidatoDAO {

	@PersistenceContext(name = "ExamenRecuperacionServidorPersistenceUnit")  
	private EntityManager em;
	
	public void insert(Candidato c) {
		em.persist(c);
	}
	
	public Candidato read(String cedula) {
		return em.find(Candidato.class, cedula);
	} 
	
	public List<Candidato>listarCandidato(){
			String jpql = "SELECT c FROM Candidato c ";

			Query q = em.createQuery(jpql, Candidato.class);
			return q.getResultList();
		} 
}
