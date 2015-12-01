import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Book_Main {

	public static void main(String[] args) {
		File bookXml = new File("books.xml");
		Catalog books = new Catalog();
		Pattern pattern = Pattern.compile("Corets, Eva");
		
		try {
			System.out.println("Existeix el fitxer? " + existeix_fitxer(bookXml));

			books = unmarshallLlista(bookXml);
			
			for (Book x : books.getCatalog()) {
				Matcher matcher = pattern.matcher(x.getAuthor());
				while (matcher.find()) {
					System.out.println(x.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static boolean existeix_fitxer(File file){
		boolean existeix = false;
		
		try {
			 existeix = file.exists();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return existeix;
	}
	
	private static Catalog unmarshallLlista(File fitxer_entrada) throws IOException {
		try {
			//Clase CONTEXT: clase que acaba de fer la traducció al xml
			JAXBContext contexte = JAXBContext.newInstance(Catalog.class);
			//Destransformador
			Unmarshaller um = contexte.createUnmarshaller();
			//creem el reader
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader(fitxer_entrada));
			
			Catalog temporal = (Catalog) um.unmarshal(fitxer_entrada);
		
			reader.close();
			
			return temporal;
		} catch (JAXBException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
