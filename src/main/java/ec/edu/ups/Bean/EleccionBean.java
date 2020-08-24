package ec.edu.ups.Bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.modelo.Canvoto;
import ec.edu.ups.modelo.Elecciones;
import ec.edu.ups.modelo.Votos;
import ec.edu.ups.negocio.EleccionLocal;

@ManagedBean
@ViewScoped
public class EleccionBean {
	
	
	@Inject
	public EleccionLocal elelocla;
	
	private String titulo;
	private Votos newvotos;
	private Candidato newcandidato;
	private Elecciones neweleccio;

	private List<Canvoto> listavotos= new ArrayList<Canvoto>();

	
	@PostConstruct
	public void init() {
		newvotos = new Votos();
		newcandidato = new Candidato();
		neweleccio = new Elecciones();
		
	}
	
	
	
	public Candidato getNewcandidato() {
		return newcandidato;
	}

	public void setNewcandidato(Candidato newcandidato) {
		this.newcandidato = newcandidato;
	}
	public Elecciones getNeweleccio() {
		return neweleccio;
	}
	public void setNeweleccio(Elecciones neweleccio) {
		this.neweleccio = neweleccio;
	}

	public EleccionLocal getElelocla() {
		return elelocla;
	}

	public void setElelocla(EleccionLocal elelocla) {
		this.elelocla = elelocla;
	}

	public Votos getNewvotos() {
		return newvotos;
	}

	public void setNewvotos(Votos newvotos) {
		this.newvotos = newvotos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Canvoto> getListavotos() {
		return listavotos;
	}

	public void setListavotos(List<Canvoto> listavotos) {
		this.listavotos = listavotos;
	}


	@Override
	public String toString() {
		return "EleccionBean [elelocla=" + elelocla + ", titulo=" + titulo + ", newelecciones=" + newvotos
				+ ", listavotos=" + listavotos + "]";
	}
	
	public String  Guardarcandidato() {
		 try {
			elelocla.guardarcandidato(newcandidato);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public String Guardar() {
		
		try {
			elelocla.guardarelec(neweleccio);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	
	
	public String votos() {
		listavotos = null;
		listavotos = elelocla.ListarVoto(titulo);
		return null;
	}

}
