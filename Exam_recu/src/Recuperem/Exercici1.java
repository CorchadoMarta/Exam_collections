package Recuperem;

import java.util.ArrayDeque;
import java.util.ArrayList;

// Exercici 1: 2 punts
// Crea una estructura dinàmica de dades que emmagatzemi amb una cua LIFO i una FIFO
// els animals que estan esperant a ser atesos pel veterinari.
// Simula el bucle d'atenció als animals.
// L'ordre és el mateix que el de l'estructura inicial.
//
// Definició de cada cua: 1 punt (les dues)
// Mostrar bé les cues: 1 punt (les dues)
// -0,5 si hi ha mètodes dels quals no en verifiques el retorn (excepte els proporcionats pel professor)

public class Exercici1 {

	public static void main(String[] args) {

		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>(11);
		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));

		// Creem les estructures per a emmagatzemar
		ArrayDeque<Animal> cuaLifo = new ArrayDeque<Animal>();
		ArrayDeque<Animal> cuaFifo = new ArrayDeque<Animal>();
		//Afegim tots els animals en cada cua
		cuaLifo.addAll(LlistaInicial);
		cuaFifo.addAll(LlistaInicial);
		
		//Definim la variable per a mostrar el que estem mirant en aquell moment
		Animal mostra;
		
		System.out.println("Cua LIFO");
		//Mentre el tamany de la sua sigui superior a 0 (es a dir no estigui buida) 
		while (cuaLifo.size() > 0) {
			// Treu l'ultim valor
			mostra = cuaLifo.pollLast();
			//Si aquest valor no es null, imprimeix-lo
			if (mostra != null) {
				System.out.println(mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}

		}
		System.out.println("Cua FIFO");
		//Mentre el tamany de la sua sigui superior a 0 (es a dir no estigui buida)
		while (cuaFifo.size() > 0) {
			// Treu el primer valor
			mostra = cuaFifo.pollFirst();
			//Si aquest valor no es null, imprimeix-lo
			if (mostra != null) {
				System.out.println(mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}
		}
	}
}
