package mountainView;

import java.util.Scanner;

public class Alarma {
	String[] autorizados = { "usuario", "ana", "caiman", "batman", "maria", "conda", "vigilante", "nino", "sara",
			"limpieza" };

	public String temperatura(double v) {
		if (v > 45) {
			return "incendio";
		}
		if (v > 35) {
			return "ola calor";
		}
		if (v > 20) {
			return "refrescar";
		}
		if (v > 10) {
			return "ideal";
		}
		return "descongelar";
	}

	public String robo(boolean p) {
		if (p) {
			return "Alarma seguridad";
		}
		return "";

	}

	public String intruso(boolean p, boolean pr) {
		if (pr) {
			String id = pedir_identificacion();
			for (int i = 0; i > autorizados.length; i++) {
				if (id.equals(autorizados[i])) {
					return "OK";
				}
			}
			return "hacker";

		}
		return "falsa alarma";
	}

	private String pedir_identificacion() {
		System.out.print("Usuario: ");
		Scanner sc = new Scanner(System.in);

		return sc.nextLine();
	}
}
