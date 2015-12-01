import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name = "value")

public class Prestec {
	private int id;
	private String codiProducte;
	private String refBBDD;
	private String nomClient;
	private String cognomsClient;
	private double total;
	
	
	public Prestec() {
		super();
	}


	public Prestec(int id, String codiProducte, String refBBDD, String nomClient, String cognomsClient, double total) {
		super();
		this.id = id;
		this.codiProducte = codiProducte;
		this.refBBDD = refBBDD;
		this.nomClient = nomClient;
		this.cognomsClient = cognomsClient;
		this.total = total;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodiProducte() {
		return codiProducte;
	}


	public void setCodiProducte(String codiProducte) {
		this.codiProducte = codiProducte;
	}


	public String getRefBBDD() {
		return refBBDD;
	}


	public void setRefBBDD(String refBBDD) {
		this.refBBDD = refBBDD;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getCognomsClient() {
		return cognomsClient;
	}


	public void setCognomsClient(String cognomsClient) {
		this.cognomsClient = cognomsClient;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}

		
}