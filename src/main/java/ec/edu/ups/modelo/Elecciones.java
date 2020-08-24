package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Elecciones implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int titu_Id;

	private String titu_nombre;
	
	private String titu_fech_vigencia;

	
	
	public Elecciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTitu_Id() {
		return titu_Id;
	}

	public void setTitu_Id(int titu_Id) {
		this.titu_Id = titu_Id;
	}

	public String getTitu_nombre() {
		return titu_nombre;
	}

	public void setTitu_nombre(String titu_nombre) {
		this.titu_nombre = titu_nombre;
	}

	public String getTitu_fech_vigencia() {
		return titu_fech_vigencia;
	}

	public void setTitu_fech_vigencia(String titu_fech_vigencia) {
		this.titu_fech_vigencia = titu_fech_vigencia;
	}
	
	
}
