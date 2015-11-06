
public class PujadaDeSouException extends ArithmeticException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1650207634976548705L;

	String msg;

	public PujadaDeSouException(Empleat empleat , String string) {
		this.msg = empleat.getNom() + " " + empleat.getCognom() + " " + string;
	}

	public String toString() {
		return "Pujada de sou errònea: l'empleat " + msg;
	}

}
