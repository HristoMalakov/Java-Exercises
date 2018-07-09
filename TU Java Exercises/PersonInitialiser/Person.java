import java.util.*;

public class Person {
	
	static Scanner sc = new Scanner(System.in);
    String name;
    int age;
    
    Person(){
        name = "Harry Potter";
        age = 20;
    }
    
    Person(String name){
    	this.name = name;
    	age = 20;  
    }
    
    Person(int age){
    	name = "Harry Potter";
        this.age=age;
    }
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public static void main(String[] arg){
        Person ps[]=new Person[4];
        ps[0]= new Person();
        ps[1]= new Person(22);
        ps[2]= new Person("Ivan");
        ps[3]= new Person("Pesho",26);
        main(ps);  
    }
    
    public static void main(Person[] ps){
        for(int i=0;i<ps.length;i++){	
            System.out.print(ps[i].name);
            System.out.println("   age: "+ps[i].age);
        }
    }
}