package desarrollo;

public class SaborAVainilla extends Raza {

	public SaborAVainilla() {
		this.salud = 1000;
		this.arma = "Ninguno";
		this.rangomin = 10;
		this.rangomax = 30;
		this.daño = 50;
		this.estado = "Delicioso";
	}

	@Override
	public void atacar(Raza enemigo) {
		enemigo.recibirAtaque(this);
	}

	@Override
	public void recibirAtaque(Raza enemigo) {
		this.salud -= enemigo.daño;
	}

	@Override
	public void descansar() {
	}

}
