package mountainView;

import java.util.Random;

public class Eventos {

	public static void main(String[] args) {
		Random ran = new Random();
		
		Sensor s = new Sensor();
		
		s.setTemperatura(ran.nextInt(40));
		double antes = s.temperatura(s.getTemperatura());
		System.out.println("Alguien llega a la sala...");
		double despues = s.temperatura(s.getTemperatura()+2);
		double diferencia = despues - antes;
		s.setPuerta(3);
		s.setPresencia((int)diferencia);
		
		Alarma a = new Alarma();
		//Situación bajo control
		System.out.println("Nivel de temperatura --->> " + a.temperatura(s.temperatura(s.getTemperatura())));
		String r = a.intruso(s.puerta_abierta(s.getPuerta()), s.presencia());
		System.out.println("-- Identificado --\\/|| " + r);

	}

}
