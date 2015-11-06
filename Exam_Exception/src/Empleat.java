
public class Empleat extends Persona {

	String carrec;
	double souAnual;

	
	public Empleat(String nom, String cognom, String carrec, double souAnual) {
		super(nom, cognom);
		this.carrec = carrec;
		this.souAnual = souAnual;
	}

	public String getCarrec() {
		return carrec;
	}

	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}

	public double getSouAnual() {
		return souAnual;
	}

	public void setSouAnual(double souAnual) {
		this.souAnual = souAnual;
	}

}
