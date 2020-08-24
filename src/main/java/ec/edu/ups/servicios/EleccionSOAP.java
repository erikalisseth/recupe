package ec.edu.ups.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.negocio.EleccionLocal;

@WebService
public class EleccionSOAP {
	
	@Inject
	private EleccionLocal elelocal;
	
	
	@WebMethod
	public void votar(String cedula,String nombre, int candidato) {
		
		try {
			 elelocal.votar(cedula, nombre, candidato);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@WebMethod
	public List<Candidato> liscandidato(String eleccion) {
		
		List<Candidato>li = new ArrayList<Candidato>();
		li=elelocal.liscandidato();		
		
		return li;
		
	}

}
