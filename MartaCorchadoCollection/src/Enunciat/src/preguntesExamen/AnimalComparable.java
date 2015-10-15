package Enunciat.src.preguntesExamen;

import java.util.Comparator;

public class AnimalComparable implements Comparator<Animal>{
	@Override
	public int compare(Animal a, Animal b) {
		
		// Compare Potencia Fiscal de mes petit a més gran
		if (a.valorMercat() > b.valorMercat())
			return 1;
		if (a.valorMercat() < b.valorMercat())
			return -1;			
		return 0;
	}

}
