
public class StandardTimePrinter {
     private int hour;
     private int min;
     private int sec;
     
     public StandardTimePrinter(){
    	 this(0,0,0);
     }
     public StandardTimePrinter(int h){
    	 this(h,0,0);
     }
     public StandardTimePrinter(int h,int m){
    	 this(h,m,0);
     }
     public StandardTimePrinter(int h, int m, int s){
    	 setTime(h,m,s);
     }
     
     public void setTime(int h,int m, int s){
    	 setHour(h);
    	 setMinute(m);
    	 setSecond(s);
     }
     public void setHour(int h){
    	 hour = ((h>(-1)&&h<24)?h:0);
     }
     public void setMinute(int m){
    	 min = ((m>(-1)&&m<60)?m:0);
     }
     public void setSecond(int s){
    	 sec = ((s>(-1)&&s<60)?s:0);
     }
     public int getHour(){
    	 return hour;
     }
     public int getMinute(){
    	 return min;
     }   
     public int getSecond(){
    	 return sec;
     }
     
     public String Time(){
    	 return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
     }
     
     
     
}
