package desarrollo;

public class Rocnes extends Raza {
	private int erroAtaque;
	private int cantAtaquesValidos;

	public Rocnes() {
		this.salud = 84;
		this.arma = "Alabarda";
		this.rangomin = 0;
		this.rangomax = 5;
		this.da�o = 51;
		this.estado = "Vivo";
		this.erroAtaque = 0;
		this.cantAtaquesValidos = 0;
	}

	@Override
	public void atacar(Raza enemigo) {
		if (this.cantAtaquesValidos > 0) {
			enemigo.recibirAtaque(this);
			this.cantAtaquesValidos--;
		} else {
			this.cantAtaquesValidos = 3;
			this.erroAtaque++;
		}

	}

	@Override
	public void recibirAtaque(Raza enemigo) {
		this.salud -= enemigo.da�o;
		this.da�o = 51;
		this.erroAtaque = 0;
	}

	@Override
	public void descansar() {
		this.da�o = this.da�o + (5 * this.erroAtaque);
	}

}
