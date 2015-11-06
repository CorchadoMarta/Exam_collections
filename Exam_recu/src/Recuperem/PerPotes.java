package Recuperem;

import java.util.Comparator;

public class PerPotes implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		if (a1.getPotes() > a2.getPotes())
			return -1;
		if (a1.getPotes() < a2.getPotes())
			return 1;
		if (a1.getPotes() == a2.getPotes()){
			if (a1.valorMercat() > a2.valorMercat())
				return -1;
			if (a1.valorMercat() < a2.valorMercat())
				return 1;
		}
		return 0;
	}
}
