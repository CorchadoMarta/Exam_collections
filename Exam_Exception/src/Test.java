import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		// Creem Empleats
		Empleat empl1 = new Empleat("Gerard", "Sala", "Becari", 10000.0);
		Empleat empl2 = new Empleat("Juan", "Oliva", "Recursos Humans", 18000.0);
		Empleat empl3 = new Empleat("Roger", "Bertran", "Informatic", 22000.0);
		Empleat empl4 = new Empleat("Josep Maria", "Cagigal", "Programador", 250000.0);
		Empleat empl5 = new Empleat("Jordi", "Felip", "Becari", 10000.0);

		// Creem dos caps
		Cap subdirector = new Cap("Chema", "G.Arias", "Subdirector", 30000.0, 10);
		Cap jefa = new Cap("Marta", "Corchado", "Jefaza", 35000.0, 15);

		// Pujem sous
		try {
			PujaSou(empl1, 0);
		} catch (PujadaDeSouException e) {
			System.out.println(e.toString());
		}

		try {
			PujaSou(empl2, -1);
		} catch (PujadaDeSouException e) {
			System.out.println(e.toString());
		}

		try {
			PujaSou(empl3, 3);
		} catch (PujadaDeSouException e) {
			System.out.println(e.toString());
		}

		try {
			PujaSou(empl4, -5);
		} catch (PujadaDeSouException e) {
			System.out.println(e.toString());
		}

		try {
			PujaSou(empl5, 5);
		} catch (PujadaDeSouException e) {
			System.out.println(e.toString());
		}

		// Mirem el bonus dels caps
		try {
			CalculBonus(subdirector, 0);
		} catch (ArithmeticException e) {
			System.out.println(subdirector.getNom() + " " + subdirector.getCognom() + "Te el següent error:");
			System.out.println(e.getMessage());
		}

		try {
			CalculBonus(jefa, 2);
		} catch (ArithmeticException e) {
			System.out.println(jefa.getNom() + " " + jefa.getCognom() + " te el següent error:");
			System.out.println(e.getMessage());
		}

		// Metodes 1 y 2
		metode1(true);
		metode1(false);

		metode2(true);
		metode2(false);

		// Situem les dues linies
		try {
			metodeFinal();
			System.out.println("Final normal");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		try{
			
		}finally {
			System.out.println("Final en qualsevol cas");
		}

}

	// Metode per pujar el sou
	public static void PujaSou(Empleat empleat, double pujada) throws PujadaDeSouException {
		double nouSou = 0;
		if (pujada < 0) {
			throw new PujadaDeSouException(empleat, "no pot fer una pujada de sou negativa.");
		}
		double souAntic = empleat.getSouAnual();
		nouSou = souAntic + (1 + pujada / 100);
		System.out.println("L'empleat " + empleat.getNom() + " " + empleat.getNom() + "te una pujada de " + nouSou);
	}

	// Metode per calcular el bonus
	public static double CalculBonus(Cap cap, int mensualitats) throws ArithmeticException {
		int bonusAntic = cap.bonusAnual;
		double bonusNou = bonusAntic / mensualitats;
		if (mensualitats == 0) {
			throw new ArithmeticException();
		}
		System.out.println("El cap " + cap.getNom() + " " + cap.getCognom() + " té un bonus de " + bonusNou);
		return bonusNou;
	}

	// Exercici 5: creem 2 metodes
	public static void metode1(boolean resultat) {
		try {
			if (resultat) {
				throw new IOException();
			}
			;
		} catch (IOException e) {
			System.out.println("Estas al metode 1");
		}
	}

	public static void metode2(boolean resultat) {
		try {
			if (resultat) {
				throw new RuntimeException();
			}
			;
		} catch (RuntimeException e) {
			System.out.println("Estas al metode 2");
		}
	}
	
	//Exercici 6: Metode final
	public static void metodeFinal() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
}
