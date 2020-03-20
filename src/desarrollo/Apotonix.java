package desarrollo;

public class Apotonix extends Raza {

	private int ataqRecibidos;
	private double defensa;
	private int dañobase;
	private int saludbase;

	public Apotonix() {
		this.dañobase = 8;
		this.saludbase = 81;
		this.daño = 8;
		this.salud = 81;
		this.rangomin = 5;
		this.rangomax = 49;
		this.arma = "Arco";
		this.estado = "vivo";
		this.defensa = (5/6);
		this.ataqRecibidos = 0;
	}

	public int getAtaqRecibidos() {
		return ataqRecibidos;
	}

	public void setAtaqRecibidos(int ataqRecibidos) {
		this.ataqRecibidos = ataqRecibidos;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	public void recibirAtaque(Raza enemigo) {
		this.ataqRecibidos++;
		this.salud = (int) (this.salud - (this.defensa * enemigo.daño));
		if (this.salud <= 0) {
			this.estado = "Muerto";
			this.salud = 0;
		}
	}

	@Override
	public void atacar(Raza enemigo) {
		this.daño *= this.dañobase * this.ataqRecibidos;
		enemigo.recibirAtaque(this);
	}

	@Override
	public void descansar() {
		this.salud += this.saludbase * (1 / 4);
		if (this.salud > this.saludbase)
			this.salud = this.saludbase;
	}

}