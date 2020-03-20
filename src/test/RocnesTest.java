package test;

import org.junit.Assert;
import org.junit.Test;

import desarrollo.Rocnes;
import desarrollo.SaborAVainilla;

public class RocnesTest {

	@Test
	public void RocnesTestUnoAtacarFallo() {
		Rocnes r1 = new Rocnes();
		SaborAVainilla s1 = new SaborAVainilla();
		r1.atacar(s1);
		Assert.assertEquals(1000,s1.getSalud());
		
		r1 = null;
		s1 = null;
	}
	
	@Test
	public void RocnesTestUnoAtacarValido() {
		Rocnes r1 = new Rocnes();
		SaborAVainilla s1 = new SaborAVainilla();
		r1.atacar(s1);
		Assert.assertEquals(1000,s1.getSalud());
		r1.atacar(s1);
		r1.atacar(s1);
		r1.atacar(s1);
		Assert.assertEquals(847,s1.getSalud());
		
		r1 = null;
		s1 = null;
	}
	
	@Test
	public void RocnesTestUnoDescansarAtacar() {
		Rocnes r1 = new Rocnes();
		SaborAVainilla s1 = new SaborAVainilla();
		r1.atacar(s1);
		Assert.assertEquals(1000,s1.getSalud());
		r1.descansar();
		r1.atacar(s1);
		Assert.assertEquals(944,s1.getSalud());
		
		r1 = null;
		s1 = null;
	}
	
	@Test
	public void RocnesTestUnoDescansarRecibirAtaque() {
		Rocnes r1 = new Rocnes();
		SaborAVainilla s1 = new SaborAVainilla();
		r1.descansar();
		r1.recibirAtaque(s1);
		Assert.assertEquals(34,r1.getSalud());
		r1.atacar(s1);
		Assert.assertEquals(1000,s1.getSalud());
		r1.atacar(s1);
		Assert.assertEquals(949,s1.getSalud());
		r1 = null;
		s1 = null;
	}
	
	@Test
	public void RocnesTestUnoDescansarBonoAtaque() {
		Rocnes r1 = new Rocnes();
		SaborAVainilla s1 = new SaborAVainilla();
		r1.atacar(s1);
		r1.atacar(s1);
		r1.atacar(s1);
		r1.atacar(s1);
		r1.atacar(s1);
		r1.descansar();
		Assert.assertEquals(61,r1.getDaño());
		r1 = null;
		s1 = null;
		
	}

}