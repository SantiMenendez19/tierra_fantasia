package desarrollo;

public class Hudin extends Raza {
	private boolean estaMeditando;

	public Hudin() {
		this.salud = 100;
		this.arma = "Espada Larga";
		this.rangomin = 1;
		this.rangomax = 3;
		this.daño = 83;
		this.estado = "Vivo";
		this.estaMeditando = false;
	}

	@Override
	public void atacar(Raza enemigo) {
		if (!this.estaMeditando) {
			enemigo.recibirAtaque(this);
			this.salud += (int) (this.salud * 0.03);
		}
	}

	@Override
	public void recibirAtaque(Raza enemigo) {
		if (!this.estado.equals("Muerto")) {
			if (this.estaMeditando) {
				this.estaMeditando = false;
			}
			this.salud -= enemigo.daño * 2;
			if (this.salud < 0) {
				this.estado = "Muerto";
			}
		}
	}

	@Override
	public void descansar() {
		this.estaMeditando = true;
	}

}
