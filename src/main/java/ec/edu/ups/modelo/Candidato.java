package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Candidato implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int can_id;

	private String can_cedula;
	
	private String can_nombre;
		
	private String can_lista;
	
	@ManyToOne
	@JoinColumn(name="can_eleccion")
	private Elecciones can_eleccion;

	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCan_id() {
		return can_id;
	}

	public void setCan_id(int can_id) {
		this.can_id = can_id;
	}

	public String getCan_cedula() {
		return can_cedula;
	}

	public void setCan_cedula(String can_cedula) {
		this.can_cedula = can_cedula;
	}

	public String getCan_nombre() {
		return can_nombre;
	}

	public void setCan_nombre(String can_nombre) {
		this.can_nombre = can_nombre;
	}


	public String getCan_lista() {
		return can_lista;
	}

	public void setCan_lista(String can_lista) {
		this.can_lista = can_lista;
	}

	public Elecciones getCan_eleccion() {
		return can_eleccion;
	}

	public void setCan_eleccion(Elecciones can_eleccion) {
		this.can_eleccion = can_eleccion;
	}

	
	
}
