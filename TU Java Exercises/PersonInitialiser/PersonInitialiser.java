
public class PersonInitialiser {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name+"\t"+p.age);
		
		Person p1 = new Person(19);
		System.out.println(p1.name+"\t"+p1.age);
		
		Person p3 = new Person("Harry Potter");
		System.out.println(p3.name+"\t"+p3.age);
		
		Person p4 = new Person("Harry Potter", 19);
		System.out.println(p4.name+"\t"+p4.age);

	}

}
