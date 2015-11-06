package preguntesExamen;

import java.util.ArrayDeque;
import java.util.ArrayList;

// Exercici 1:
// Crea una estructura dinàmica de dades que emmagatzemi amb una cua LIFO
// els animals que estan esperant a ser atesos pel veterinari.
// Simula el bucle d'atenció als animals.
// L'ordre és el mateix que el de l'estructura inicial.

public class Exercici1 {

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
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));

		ArrayDeque<Animal> cuaLifo = new ArrayDeque<Animal>();
		ArrayDeque<Animal> cuaFifo = new ArrayDeque<Animal>();
		cuaLifo.addAll(LlistaInicial);
		cuaFifo.addAll(LlistaInicial);

		Animal mostra;
		
		System.out.println("Cua LIFO");
		while (cuaLifo.size()>0) {
			mostra = cuaLifo.pollLast();
			if (mostra != null) {
				System.out.println(mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}

		}
		System.out.println("Cua FIFO");

		while (cuaFifo.size()>0) {
			mostra = cuaFifo.pollFirst();
			if (mostra != null) {
				System.out.println(mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " "
						+ mostra.valorMercat());
			}

		}

	}

}
