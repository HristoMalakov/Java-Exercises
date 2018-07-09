
public enum Enumeration1 {
       bucky("nice","22"),
       hristo("programmer","20"),
       lel("kek","0"),
       stefan("not-coder","20"),
       borislav("gopnik","20");
	
	final String desc;
	final String age;
	
	Enumeration1(String description, String age1){
		desc = description;
		age = age1;
	}
	public String getDesc(){
		return desc;
	}
	public String getAge(){
		return age;
	}
	
}
