package Recuperem;

// La classe animal defineix els animals d'una granja qualsevol
// Aquí no hi has de fer res en especial (si no vols)

public class Animal {
	
	public Animal() {
		super();
	}
	public Animal(int codi, String breed, Double pes, int potes, Double preuVendaCanal) {
		super();
		this.codi = codi;
		this.breed = breed;
		this.pes = pes;
		this.potes = potes;
		this.preuVendaCanal = preuVendaCanal;
	}

	int codi;
	// Breed = raça
	String breed;
	Double pes;
	int potes;
	Double preuVendaCanal;

	public int getCodi() {
		return codi;
	}
	
	public void setCodi(int codi) {
		this.codi = codi;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Double getPes() {
		return pes;
	}

	public void setPes(Double pes) {
		this.pes = pes;
	}

	public int getPotes() {
		return potes;
	}

	public void setPotes(int potes) {
		this.potes = potes;
	}

	public Double getPreuVendaCanal() {
		return preuVendaCanal;
	}

	public void setPreuVendaCanal(Double preuVendaCanal) {
		this.preuVendaCanal = preuVendaCanal;
	}

	public double valorMercat() {
		return preuVendaCanal * pes;
	}

}
