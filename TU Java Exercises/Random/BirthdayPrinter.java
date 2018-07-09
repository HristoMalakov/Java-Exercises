

	public class BirthdayPrinter {
	    private int day,month,year;
	    public BirthdayPrinter(int d, int m, int y){
	        this.day = d;
	        this.month = m;
	        this.year = y;
	    }
	    public BirthdayPrinter(){
	    	
	    	this.month = (int)(Math.random()*12+1);
	    	this.year = (int)(Math.random()*100+1930);
	    	
	    	if (this.month !=2)this.day = (int)(Math.random()*30+1);
	    	
	    	else if (this.year%4!=0)this.day = (int)(Math.random()*28+1);
	    	
	    	else { this.day = (int)(Math.random()*27+1);}
	    	
	    	
	    }
	    
	    public String toString(){
	        return "("+day+","+month+","+year+")";
	    
	}
	}
	

