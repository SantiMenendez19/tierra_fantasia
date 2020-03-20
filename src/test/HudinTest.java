package test;

import org.junit.Assert;
import org.junit.Test;

import desarrollo.Hudin;
import desarrollo.SaborAVainilla;

public class HudinTest {

	@Test
	public void HudinTestUnoAtacar() {
		Hudin h1 = new Hudin();
		SaborAVainilla s1 = new SaborAVainilla();
		h1.atacar(s1);
		Assert.assertEquals(917,s1.getSalud());
		Assert.assertEquals(103,h1.getSalud());
		
		h1 = null;
		s1 = null;
	}
	
	@Test
	public void HudinTestUnoRecibir() {
		Hudin h1 = new Hudin();
		SaborAVainilla s1 = new SaborAVainilla();
		h1.recibirAtaque(s1);
		Assert.assertEquals(0,h1.getSalud());
		
		h1 = null;
		s1 = null;
	}
	
	@Test
	public void HudinTestUnoDescansar() {
		Hudin h1 = new Hudin();
		SaborAVainilla s1 = new SaborAVainilla();
		h1.descansar();
		h1.atacar(s1);
		Assert.assertEquals(1000,s1.getSalud());
		
		h1 = null;
		s1 = null;
	}
	
	@Test
	public void HudinTestUnoDescansarAtacar() {
		Hudin h1 = new Hudin();
		SaborAVainilla s1 = new SaborAVainilla();
		h1.descansar();
		h1.recibirAtaque(s1);
		Assert.assertEquals(0,h1.getSalud());
		h1.atacar(s1);
		Assert.assertEquals(917,s1.getSalud());
		h1 = null;
		s1 = null;
	}

}
