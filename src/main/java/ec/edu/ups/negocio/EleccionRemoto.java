package ec.edu.ups.negocio;

import java.util.List;

import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.modelo.Canvoto;
import ec.edu.ups.modelo.Elecciones;
import ec.edu.ups.modelo.Votos;

public interface EleccionRemoto {

public void guardarcandidato(Candidato can);
	
	public void guardarelec(Elecciones ele) ;
	
	public void guardarvoto(Votos vo) ;
	
	public void votar(String cedula,String nombre,int candidato) ;
	
	public List<Canvoto> ListarVoto(String eleccion) ;

	public List<Candidato> liscandidato();
}
