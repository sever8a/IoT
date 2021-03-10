

import static org.junit.Assert.*;

import org.junit.Test;

import mountainView.Alarma;

public class TestAlarma {

	@Test
	public void testTemperatura() {
		Alarma a = new Alarma();
		String valor = a.temperatura(20);
 
		assertEquals("ola calor",valor);
	}

	@Test
	public void testRobo() {
		Alarma a = new Alarma();
		String valor = a.robo(true);
		
		assertTrue(valor.equals("Alarma seguridad"));
	}

	@Test
	public void testIntrusoOK() {
		//El usuario está autorizado
		Alarma a = new Alarma();
		String valor = a.intruso(false, true);
		
		assertEquals("OK",valor);
		
	}
	
	@Test
	public void testIntrusoHacker() {
		//El usuario no está autorizado
		Alarma a = new Alarma();
		String valor = a.intruso(true, false);
		
		assertEquals("hacker",valor);
		
	}
	
	@Test
	public void testIntrusoFalso() {
		//El usuario no está autorizado
		Alarma a = new Alarma();
		String valor = a.intruso(false, false);
		
		assertEquals("falsa alarma",valor);
		
	}

}
