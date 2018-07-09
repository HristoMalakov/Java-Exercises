
public class InheritanceFood {

	public static void main(String[] args) {
		
		Person bucky = new Person();
		Food po = new Potpie();
		Food tu = new Tuna();
		
		
		bucky.digest(po);
		bucky.digest(tu);

	}

}
