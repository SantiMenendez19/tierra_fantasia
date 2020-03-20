package desarrollo;

public abstract class Raza {
	protected int salud;
	protected String arma;
	protected int daño;
	protected int rangomin;
	protected int rangomax;
	protected String estado;

	public Raza() {
		
	}
	
	
	
	public int getSalud() {
		return salud;
	}



	public void setSalud(int salud) {
		this.salud = salud;
	}



	public String getArma() {
		return arma;
	}



	public void setArma(String arma) {
		this.arma = arma;
	}



	public int getDaño() {
		return daño;
	}



	public void setDaño(int daño) {
		this.daño = daño;
	}



	public int getRangomin() {
		return rangomin;
	}



	public void setRangomin(int rangomin) {
		this.rangomin = rangomin;
	}



	public int getRangomax() {
		return rangomax;
	}



	public void setRangomax(int rangomax) {
		this.rangomax = rangomax;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	abstract public void atacar(Raza enemigo);
	abstract public void recibirAtaque(Raza enemigo);
	abstract public void descansar();
	
	

}
