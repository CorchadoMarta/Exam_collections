package Enunciat.src.preguntesExamen;

import java.util.ArrayDeque;
import java.util.ArrayList;

// Exercici 1 (2 punts)
// Crea una estructura dinàmica de dades que emmagatzemi amb una cua LIFO i una cua FIFO
// els animals que estan esperant a ser atesos pel veterinari.
// Simula el bucle d'atenció als animals.
// L'ordre és el mateix que el de l'estructura inicial.
// 1 punt: creació de la bona estructura
// 0,5 punt: bucle FIFO
// 0,5 punt: bucle LIFO

public class Exercici1 {

	public static void main(String[] args) {

		// Aquesta estructura és perquè carreguis els objectes amb el mètode
		// correspondent
		// Tots alhora.

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
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));
		
		// Declara les cues aquí
		ArrayDeque<Animal> lifoAnimal = new ArrayDeque<Animal>();
		ArrayDeque<Animal> fifoAnimal = new ArrayDeque<Animal>();
		
		// Afegeix els elements de la llista a les dues cues aquí:
		for (int i = 0; i < LlistaInicial.size(); i++){
			lifoAnimal.offerFirst(LlistaInicial.get(i));
			fifoAnimal.offerLast(LlistaInicial.get(i));
		}
		
		Animal mostra = new Animal();
		
		// Imprimeix la cua LIFO
		System.out.println("Cua LIFO");
		while(!lifoAnimal.isEmpty()){
			System.out.println(lifoAnimal.pollFirst());
		}
		
		// Sysout comú per mostrar l'animal per "mostrar"
				System.out.println(mostra);

		// Imprimeix la cua LIFO
		System.out.println("Cua FIFO");
		while(!fifoAnimal.isEmpty()){
			System.out.println(fifoAnimal.pollFirst());
		}
	}

}
