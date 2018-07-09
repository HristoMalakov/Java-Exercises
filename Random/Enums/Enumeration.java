import java.util.EnumSet;


public class Enumeration {

	public static void main(String[] args) {
		
		for(Enumeration1 x: Enumeration1.values()){
			System.out.printf("%s %s %s\n",x,x.getDesc(),x.getAge());
		}
		
		for( Enumeration1 gopnici : EnumSet.range(Enumeration1.hristo, Enumeration1.borislav)){
			System.out.printf("%s \t %s \t %s \n",gopnici, gopnici.getDesc(), gopnici.getAge());
		}
	}

}
