import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name = "catalog")

public class Catalog {

	
	@XmlElement(name = "book", type = Book.class)
	private ArrayList<Book> catalog = new ArrayList<Book>();


	public Catalog() {
		super();
	}
	public Catalog(ArrayList<Book> catalog) {
		super();
		this.catalog = catalog;
	}
	public ArrayList<Book> getCatalog() {
		return catalog;
	}

	public void setCatalog(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}

	public void add(Book book) {
		catalog.add(book);
	}
		
}
