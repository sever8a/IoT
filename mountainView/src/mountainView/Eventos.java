package mountainView;

public class Eventos {

	public static void main(String[] args) {
		Sensor s = new Sensor();
		Alarma a = new Alarma();
		s.temperatura(30);
		System.out.println("Situación temperada: "+a.temperatura(s.temperatura(s.getTemperatura())));

	}

}
