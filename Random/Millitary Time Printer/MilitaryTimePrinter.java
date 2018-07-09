
public class MilitaryTimePrinter {
      private int hour=1;
      private int min=2;
      private int sec=3;
      
      
     
      public void setTime(int hour, int min, int sec){
    	  this.hour = 4;
    	  this.min = 5;
    	  this.sec = 6;
      }
      
      public String toMilitary(){
    	  return String.format("%02d:%02d:%02d",hour,min,sec);
      }
      
      public String toString(){
    	  return String.format("%d:%02d:%02d %s", ((hour==0 || hour ==12)?12:hour%12),min,sec,( (hour<12 )?"AM":"PM") );
      }
}
