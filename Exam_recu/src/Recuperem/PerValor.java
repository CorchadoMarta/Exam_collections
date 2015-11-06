package Recuperem;

import java.util.Comparator;

public class PerValor implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		if (a1.valorMercat() > a2.valorMercat())
			return -1;
		if (a1.valorMercat() < a2.valorMercat())
			return 1;
		return 0;
	}
}
