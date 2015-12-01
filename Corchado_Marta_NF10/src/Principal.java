import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Principal {

	public static void main(String[] args) {
		//HashMap<Integer, Prestec> mapa = new HashMap<Integer, Prestec>();
		Prestec_Map mapa = new Prestec_Map();
		mapa.put(1, new Prestec(342323, "hipoteca", "H012", "Joan", "Coromines", 250000));
		mapa.put(3, new Prestec(2342, "hipoteca", "H013", "Pere", "Calders", 200000));
		mapa.put(6, new Prestec(34311, "hipoteca", "H011", "Pere", "Quart", 120000));
		mapa.put(7, new Prestec(2121, "personal", "PX93", "Quim", "Monzó", 25500));
		mapa.put(8, new Prestec(6545, "personal", "PX22", "Màrius", "Serra", 99000));
		mapa.put(9, new Prestec(44, "auto", "A066", "Martí", "Sales", 12300));

		try {
			marshallMap(mapa, new File("llista_prestecs.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("FI");
		}
	}

	
	private static void marshallMap(Prestec_Map mapa, File file) {
		try {
			//Clase CONTEXT: clase que acaba de fer la traducció al xml
			JAXBContext contexte = JAXBContext.newInstance(Prestec_Map.class);
			BufferedWriter writer = null;
			writer = new BufferedWriter(new FileWriter(file));
			//Transformador
			Marshaller m = contexte.createMarshaller();
			//Posar-ho bonic
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(mapa, writer);
			
			writer.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}
	
}