package Recuperem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

// Has de crear una estructura d'animals que ordeni primer per raça 
// i després pel seu preu de venda
// 
// OPCIÓ 1: Fins a 5,5 punts
// Estructura bidimensional, sent la primera "dimensió" les races ordenades alfabèticament
//     i la segona "dimensió" els animals de cada raça ordenats per valor sense canviar allò fet 
//     a l'exercici 2
// Cal extreure totes les races (només un cop)
// Per cada raça, crear un element de "segona dimensió" i omplir-lo amb cada animal si coincideix la raça
// Mostrar els animals agrupats per races, i després per valor
// - Extreure races i mostrar-les: 0,5
// - Definir l'estructura bidimensional: 1,5 punts
// - Omplir l'estructura bidimensional: 2 punts
// - Mostrar l'estructura correctament: 1,5 punts


// OPCIÓ 2: Fins a 3 punts
// Estructura fent un sistema per comparar els animals amb dos criteris al mateix temps
//    - Alfabètic primer per la raça i després pel valor.
// Bona estructura: 0,5
// Criteri d'ordenació: 1,5
// S'intenta afegir bé els dos animals: 0,5
// Es mostra bé com ha quedat: 0,5

public class Exercici3 {
	public static void main(String[] args) {

		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>();

		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));
		LlistaInicial.add(new Animal(331, "campiona", 3.41, 2, 871.71));
		
		//Definim la variable per a mostrar el que estem mirant en aquell moment
		Animal mostra;
		// Verifiquem que no hi entraran duplicats
		Animal noDuplicats;
		
		// Inserim tota la llista donada per el professor a un Hash
		HashMap<Integer, Animal> mapa = new HashMap<Integer, Animal>();
		for (int i = 0; i < LlistaInicial.size(); i++) {
			noDuplicats = mapa.put(LlistaInicial.get(i).getCodi(), LlistaInicial.get(i));
			if (noDuplicats != null) {
				System.out.println("Alerta duplicat. No podem afegir l'animal: " + noDuplicats.getCodi());
			}
		}

		//Creem una estructura utilitzant el metode definit mes abaix per a ordenar el mapa que em creat abans
		HashMap<String, TreeSet<Animal>> ordenemLlista = ordenacio(mapa);
		
		//Imprimim cada raça
		for (String raza : ordenemLlista.keySet()) {
			System.out.println("Raça: " + raza);
			System.out.println("   Animals");
			// per cada raça treiem els seus valors (animals amb mateixa raça)
			TreeSet<Animal> llistaActual = ordenemLlista.get(raza);
			while (!llistaActual.isEmpty()) {
				mostra = llistaActual.pollFirst();
				System.out.println("     " + mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}
		}
	}
	
	//Creem un metode d'ordenació per races i després per valor de mercat
	public static HashMap<String, TreeSet<Animal>> ordenacio(HashMap<Integer, Animal> pMapa) {
		//Creem l'estructura que volem retornar
		HashMap<String, TreeSet<Animal>> retorn = new HashMap<String, TreeSet<Animal>>();

		// Creem el comparador per ordre alfabetic de races
		OrdreAlfabetic ordreAlf = new OrdreAlfabetic();
		// Creem l'estructura que emmagatzemarà les races per l'ordre indicat
		TreeSet<String> races = new TreeSet<String>(ordreAlf);
		for (Integer clau : pMapa.keySet()) {
			races.add(pMapa.get(clau).getBreed());
		}
		// Verifica la llista de races
		System.out.println(races);
		
		//Creem el comparador per valor de mercat
		PerValor valorMercat = new PerValor();
		//Fem un primer recorregut de l'estructura on tenim totes les races ordenades
		for (String raza : races) {
			//Creem una estructura per emmagatzemar els animals per el seu valor de mercat
			TreeSet<Animal> ordenatPerValor = new TreeSet<Animal>(valorMercat);
			// Recorrem el mapa que introdueix l'usuari
			for (Integer clau : pMapa.keySet()) {
				// Si la raça que estem mirant en aquell moment(del mapa entrat per l'usuari) es la mateixa que la del treeSet de races 
				if (pMapa.get(clau).getBreed() == raza) {
					// L'afegim a la llista temporal
					ordenatPerValor.add(pMapa.get(clau));
				}
				// Afegim la raça(key) que em buscat en la iteració del bucle i tots els animals(values) trobats d'aquella raça
				retorn.put(raza, ordenatPerValor);
			}
		}
		// Retorna els elements del mapa ordenats per raça i valor
		return retorn;
	}

	//Creem un clase comparable per ordre alfabetic de les races
	public static class OrdreAlfabetic implements Comparator<String> {

		@Override
		public int compare(String a1, String a2) {
			return a1.compareTo(a2);
		}
	}
}
