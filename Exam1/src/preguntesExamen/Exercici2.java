package preguntesExamen;

import java.util.ArrayList;
import java.util.TreeSet;

// Mostra de forma ordenada segons el valor de venda del mercat de l'animal 


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
		Animal mostra;
		perValor criteriOrdre = new perValor();
		TreeSet<Animal> ordenatValor = new TreeSet<Animal>(criteriOrdre);
		ordenatValor.addAll(LlistaInicial);

		// Intenta afegir aquest animal a l'estructura que has creat
		Animal afegeix = new Animal(394, "empordanesa", 3.95, 2, 1.17);

		System.out.println("Afegim");
		if (ordenatValor.add(afegeix)) {
			System.out.println(afegeix.getCodi() + " " + afegeix.getBreed() + " " + afegeix.getPotes() + " "
					+ afegeix.valorMercat());
		}

		while (!ordenatValor.isEmpty()) {
			mostra = ordenatValor.pollFirst();
			System.out.println(
					mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " " + mostra.valorMercat());
		}
	}

}
