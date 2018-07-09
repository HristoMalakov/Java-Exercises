
public class Vehicle extends Crashable implements Interface{

	public int wheels=0;
	public double maxSpeed = 0.0;
	public double price = 0.0;
    
    public String Vehicle(int wh, double ms, double p){
    	this.wheels = wh;
    	this.maxSpeed = ms;
    	this.price = p;
    	return String.format("The car has %d wheels, max speed of %.2f and costs %.2f dollars.",getWheels(),getMaxSpeed(),getPrice());
    }
    
    public double getPrice(){
		return price;
	}
    public int getWheels(){
		return wheels;
	}
    public double getMaxSpeed(){
	    return maxSpeed;
    }
    int CStr=0;
 
    public String setCarStrength(int Str){
    	CStr = Str;
    	return String.format("Its strength is "+CStr);
    }
    
}
