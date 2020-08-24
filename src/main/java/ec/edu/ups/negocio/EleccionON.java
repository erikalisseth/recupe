package ec.edu.ups.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.CandidatoDAO;
import ec.edu.ups.DAO.EleccionDAO;
import ec.edu.ups.DAO.VotosDAO;
import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.modelo.Canvoto;
import ec.edu.ups.modelo.Elecciones;
import ec.edu.ups.modelo.Votos;

@Stateless
public class EleccionON implements EleccionLocal, EleccionRemoto {
	
	@Inject
	private CandidatoDAO candao;
	
	@Inject
	private VotosDAO votodao;
	
	
	@Inject
	private EleccionDAO eledao;
	

	public void guardarcandidato(Candidato can) {
		candao.insert(can);
	}
	public void guardarelec(Elecciones ele) {
		eledao.insert(ele);
	}
	
	public void guardarvoto(Votos vo) {
		votodao.insert(vo);
	}

	
	public void votar(String cedula,String nombre,int candidato) {
	votodao.votar(cedula, nombre, candidato);
		
	}
	
	public List<Candidato> liscandidato() {
		return candao.listarCandidato();
	}
	
	
	public List<Canvoto> ListarVoto(String eleccion) {
		return votodao.getListarvotos(eleccion);
	}
}
