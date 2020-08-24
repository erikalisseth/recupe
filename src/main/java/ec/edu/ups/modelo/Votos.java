package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Votos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vot_id;
	
	private String vot_cedula;
	private String vot_nombre;
	
	@ManyToOne
	@JoinColumn(name = "vot_candidato")
	private Candidato vot_candidato;
	
	
	
	
	public int getVot_id() {
		return vot_id;
	}
	public void setVot_id(int vot_id) {
		this.vot_id = vot_id;
	}
	public String getVot_cedula() {
		return vot_cedula;
	}
	public void setVot_cedula(String vot_cedula) {
		this.vot_cedula = vot_cedula;
	}
	public String getVot_nombre() {
		return vot_nombre;
	}
	public void setVot_nombre(String vot_nombre) {
		this.vot_nombre = vot_nombre;
	}
	public Candidato getVot_candidato() {
		return vot_candidato;
	}
	public void setVot_candidato(Candidato vot_candidato) {
		this.vot_candidato = vot_candidato;
	}		
	
	
	
}
