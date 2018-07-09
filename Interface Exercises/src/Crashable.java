
public abstract class Crashable {

	boolean Driveable = true;
	
	public void Crash(){
		this.Driveable = false;
	}
	
	
	public abstract String setCarStrength(int Str);
}
