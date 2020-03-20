package test;

import org.junit.Assert;
import org.junit.Test;

import desarrollo.Apotonix;
import desarrollo.SaborAVainilla;

public class ApotonixTest {

	@Test
	public void ApotonixTestUnoSalud() {
		Apotonix a1 = new Apotonix();
		a1.descansar();
		Assert.assertEquals(81,a1.getSalud());
		a1 = null;
	}
	
	@Test
	public void ApotonixTestUnoRecibirAtaque() {
		Apotonix a1 = new Apotonix();
		SaborAVainilla s1 = new SaborAVainilla();
		a1.recibirAtaque(s1);
		System.out.println(a1.getSalud());
		Assert.assertEquals(40,a1.getSalud());
		a1 = null;
		s1 = null;
	}

}
