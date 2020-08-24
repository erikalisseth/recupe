package ec.edu.ups.modelo;

public class Canvoto {

	private String candidato;
	private int votos;
	
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	@Override
	public String toString() {
		return "CandidatoVotos [candidato=" + candidato + ", votos=" + votos + "]";
	}
}
