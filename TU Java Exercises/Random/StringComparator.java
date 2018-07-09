
public class StringComparator {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "aBc";
		String s4 = s1 + "";
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(s2));  //false

	}

}
