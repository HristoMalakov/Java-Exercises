
public class Stat {
    private String first1;
    private String last1;
    private static int members = 0;
    
	public Stat(String first, String last){
		first1 = first;
		last1=last;
		members++;
		System.out.printf("The member %s %s is added, members: %d", first1, last1, members);
	}
	
}
