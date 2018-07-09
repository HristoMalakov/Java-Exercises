
public class Main {
	
	public static void main(String[] args){
		
	    Animal[] thelist = new Animal[2];
	    Fish f = new Fish();
	    Dog d = new Dog();
	    
	    thelist[0] = f;
	    thelist[1] = d;
	    
	    for(Animal x : thelist){
	    	x.noise();
	    }
	}

}
