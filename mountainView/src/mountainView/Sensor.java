package mountainView;

public class Sensor {
	private double temperatura;
	private int puerta;
	private int presencia;
	
	public boolean presencia() {
		if (presencia > 0) {
			return true;
		}
		return false;
	}
	
	public boolean puerta_abierta(int v) {
		if (v > 0) {
			return true;
		}
		return false;
	}

	public double temperatura(double v) {
		return v * 0.9;
	}

	/**
	 * @param presencia el valor del sensor
	 */
	public void setPresencia(int presencia) {
		this.presencia = presencia;
	}
	
	/**
	 * 
	 */
	public int getPresencia() {
		return this.presencia;
	}

	/**
	 * @return the puerta
	 */
	public int getPuerta() {
		return puerta;
	}

	/**
	 * @param puerta valor del sensor
	 */
	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	/**
	 * @return the temperatura
	 */
	public double getTemperatura() {
		return temperatura;
	}

	/**
	 * @param temperatura valor del sensor
	 */
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
}
