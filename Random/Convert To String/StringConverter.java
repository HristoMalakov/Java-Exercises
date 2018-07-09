
public class StringConverter {
	
	  private int year;
	  private int month;
	  private int day;
   
	public StringConverter(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf(" %s",this);
	}
	
	public String toString(){
		return String.format("%d:%d:%d\n", day,month,year);
	}
	
}
