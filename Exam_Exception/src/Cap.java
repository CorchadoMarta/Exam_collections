
public class Cap extends Empleat{
	
	int bonusAnual;

	
	
	public Cap(String nom, String cognom, String carrec, double souAnual, int bonusAnual) {
		super(nom, cognom, carrec, souAnual);
		this.bonusAnual = bonusAnual;
	}

	public int getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(int bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	

}
