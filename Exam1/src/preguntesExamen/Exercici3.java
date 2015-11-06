package preguntesExamen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

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

		Animal mostra;
		Animal verificacio;

		HashMap<Integer, Animal> mapa = new HashMap<Integer, Animal>();
		for (int i = 0; i < LlistaInicial.size(); i++) {
			verificacio = mapa.put(LlistaInicial.get(i).getCodi(), LlistaInicial.get(i));
			if (verificacio != null) {
				System.out.println("Alerta duplicat. No podem afegir l'animal: " + verificacio.getCodi());
			}
		}

		// retorna els animals en x llistes ordenades per raça i valor de mercat
		// de més a menys valuosos.

		HashMap<String, TreeSet<Animal>> exercici = ordenacio(mapa);

		for (String raza : exercici.keySet()) {
			System.out.println("Raça: " + raza);
			System.out.println("   Animals");

			TreeSet<Animal> llistaActual = exercici.get(raza);
			while (!llistaActual.isEmpty()) {
				mostra = llistaActual.pollFirst();
				System.out.println("     " + mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}
		}
	}

	public static HashMap<String, TreeSet<Animal>> ordenacio(HashMap<Integer, Animal> pMapa) {
		HashMap<String, TreeSet<Animal>> retorn = new HashMap<String, TreeSet<Animal>>();

		// Recupera totes les races que hi ha en una estructura ordenada
		Alfabetic ordreAlf = new Alfabetic();
		TreeSet<String> races = new TreeSet<String>(ordreAlf);
		for (Integer clau : pMapa.keySet()) {
			races.add(pMapa.get(clau).getBreed());
		}
		// Verifica la llista de races
		System.out.println(races);
		// Retorna els elements del mapa ordenats per raça i valor

		perValor criteriOrdre = new perValor();

		for (String raza : races) {
			TreeSet<Animal> ordenatValorTemp = new TreeSet<Animal>(criteriOrdre);
			for (Integer clau : pMapa.keySet()) {

				if (pMapa.get(clau).getBreed() == raza) {
					// Afegim a la llista temporal
					ordenatValorTemp.add(pMapa.get(clau));
				}
				retorn.put(raza, ordenatValorTemp);
			}
		}
		return retorn;
	}

	public static class Alfabetic implements Comparator<String> {

		@Override
		public int compare(String a1, String a2) {
			return a1.compareTo(a2);
		}
	}
}
