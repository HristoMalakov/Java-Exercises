
public class Main {

	public static void main(String[] args) {
		StandardTimePrinter Obj1 = new StandardTimePrinter();
		StandardTimePrinter Obj2 = new StandardTimePrinter(5);
		StandardTimePrinter Obj3 = new StandardTimePrinter(5,13);
		StandardTimePrinter Obj4 = new StandardTimePrinter(5,13,45);
		
		System.out.printf("%s\n",Obj1.Time());
		System.out.printf("%s\n",Obj2.Time());
		System.out.printf("%s\n",Obj3.Time());
		System.out.printf("%s\n",Obj4.Time());
	}

}
