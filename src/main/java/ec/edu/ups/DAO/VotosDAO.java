package ec.edu.ups.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.modelo.Votos;
import ec.edu.ups.modelo.Canvoto;

@Stateless
public class VotosDAO {
	
	@PersistenceContext(name = "ExamenRecuperacionServidorPersistenceUnit")  
	private EntityManager em;
	private Votos voto = new Votos();
	private Canvoto canv;

	
	
	public void insert(Votos v) {
		
		em.persist(v);

	}
	
	public void votar(String cedula, String nombre, int candidato) {
		try {
			voto.setVot_cedula(cedula);
			voto.setVot_nombre(nombre);
			voto.setVot_candidato(em.find(Candidato.class, candidato));
			em.persist(voto);
		} catch (Exception e) {
		}
	}
	public List<Votos>listarVoto(){
		String jpql = "SELECT c FROM Votos c ";

		Query q = em.createQuery(jpql, Votos.class);
		return q.getResultList();
	} 
	

	public List<Canvoto> getListarvotos(String eleccion) {
		
		List<Canvoto>listaVotos= new ArrayList<Canvoto>();
		try {
			String jpql="select c.can_id from Candidato c where c.can_eleccion="+eleccion;
			Query q = em.createQuery(jpql, Integer.class);
			for (Object candidato : q.getResultList()) {
				canv = new Canvoto();
				String votosQuery = "select count(v) from Voto v WHERE v.vot_candidato="+String.valueOf(candidato);
				canv.setVotos(Integer.valueOf(String.valueOf(em.createQuery(votosQuery, Long.class).getSingleResult())));
				votosQuery = "select c.can_nombre from Candidato c WHERE c.can_id="+String.valueOf(candidato);
				canv.setCandidato(em.createQuery(votosQuery, String.class).getSingleResult());
				listaVotos.add(canv);

		}
			return listaVotos;

		}	catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
		
	}
}
