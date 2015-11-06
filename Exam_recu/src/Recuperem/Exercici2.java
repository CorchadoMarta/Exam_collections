package Recuperem;

import java.util.ArrayList;
import java.util.TreeSet;

// Exercici 2 (2,5 punts)
// Crea una estructura dinàmica de dades que emmagatzemi 
// de forma que els animals es mostrin segons la següent fórmula
// - Els animals de dues potes sempre valen menys que els animals de quatre potes
// - Si tenen el mateix nombre de potes, aleshores es comparen pel preu de venda
// 
// Intenta afegir els animals af1 i af2 tot mostrant el resultat
//
//
// Criteri
// Bona estructura: 0,5
// Criteri d'ordenació: 1
// S'intenta afegir bé els dos animals: 0,5
// Es mostra bé com ha quedat: 0,5
//-0,5 si hi ha mètodes dels quals no en verifiques el retorn (excepte els proporcionats pel professor)



public class Exercici2 {

	public static void main(String[] args) {
		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>(11);
		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "campiona", 3.41, 2, 871.71));
		Animal af1 = new Animal(394, "empordanesa", 3.95, 2, 1.17);
		Animal af2 = new Animal(394, "empordanesa", 3.99, 2, 1.17);
		
		//Definim la variable per a mostrar el que estem mirant en aquell moment
		Animal mostra;
		
		//Creem el comparador de potes
		PerPotes criteriOrdre = new PerPotes();
		// Creem la estructura per a emmagatzemar els animals segons el criteri d'ordre (les seves potes o per valor)
		TreeSet<Animal> ordenatPotes = new TreeSet<Animal>(criteriOrdre);
		ordenatPotes.addAll(LlistaInicial);
		
		// Afegim 2 animals mostrant el resultat
		System.out.println("Afegim f1?");
		// Primer afegit
		if (ordenatPotes.add(af1)) {
			System.out.println("He pogut afegir: " + af1.getCodi() + " " + af1.getBreed() + " " + af1.getPotes() + " "
					+ af1.valorMercat());
		}
		System.out.println("Afegim f2?");
		//Segon afegit
		if (ordenatPotes.add(af2)) {
			System.out.println("He pogut afegir: " + af2.getCodi() + " " + af2.getBreed() + " " + af2.getPotes() + " "
					+ af2.valorMercat());
		}
		
		// Imprimim tots els valors
		while (!ordenatPotes.isEmpty()) {
			mostra = ordenatPotes.pollFirst();
			System.out.println(
					mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " " + mostra.valorMercat());
		}
	}

}
