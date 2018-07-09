
public class Composition {
	
	private String name;
	private toStr_1 birthday;
	
	public Composition(String theName, toStr_1 theDate){
		name = theName;
		birthday = theDate;
		
		System.out.printf("%s",this);
	}
	
	public String toString(){
		return String.format("My name is %s and I have a birthday on %s", name, birthday);
	}

}
