package Enunciat.src.preguntesExamen;

import java.util.ArrayList;
import java.util.TreeSet;


// Exercici 2: (2,5 punts)
// Mostra de forma ordenada segons el valor de venda del mercat de l'animal
// de més a menys valuós
// Definició de la bona estructura que no admeti duplicats: 0,75 punt
// controlar un duplicat: 0,25 punt
// Sistema per endreçar els animals segons el preu de venda (de més a menys) 1 punt
//    aquest criteri serà reutilitzat a l'exercici 3
// Mostrar bé els animals: 0,5 punts


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
		
		//Defineix aquí la bona estructura que no admet duplicats
		AnimalComparable comparadorVal = new AnimalComparable();
		TreeSet<Animal> treeComparador = new TreeSet<Animal>(comparadorVal);
		//Com la defineixes ordenada?
		
		//No t'oblidis de ficar-hi tots els animals de la llista
		treeComparador.addAll(LlistaInicial);
		
		// Intenta afegir aquest animal a l'estructura que has creat. Si ja existeix, mostra'l per pantalla
		
		Animal afegeix = new Animal(394, "empordanesa", 3.95, 2, 1.17);

		System.out.println("Afegim");
		

		//Ara extreu els elements ordenats
		while (!treeComparador.isEmpty()) {
			System.out.println(treeComparador.pollLast());
		}
	}

}
