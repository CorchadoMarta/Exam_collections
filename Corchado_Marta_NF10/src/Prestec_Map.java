
import java.util.HashMap;

import javax.xml.bind.annotation.*;

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement (name = "entry")

	public class Prestec_Map {

		
		@XmlElement(name = "value", type = Prestec.class)
		private HashMap<Integer, Prestec> prestecs = new HashMap<Integer, Prestec>();


		public Prestec_Map() {
			super();
		}

		public Prestec_Map(HashMap<Integer, Prestec> prestecs) {
			super();
			this.prestecs = prestecs;
		}

		public void put(int index, Prestec prestec) {
			prestecs.put(index, prestec);
		}

		public HashMap<Integer, Prestec> getPrestecs() {
			return prestecs;
		}

		public void setPrestecs(HashMap<Integer, Prestec> prestecs) {
			this.prestecs = prestecs;
		}
		
}