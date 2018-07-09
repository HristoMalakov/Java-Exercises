package uni11.chapter10;

public class Cat {
    // Field name
    private String name;
    // Field color
    private String color;

    // Default constructor
    public Cat() {
        this.name = "Unnamed";
        this.color = "gray";
    }
    // Constructor with parameters
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public static void sayMiau(String name){
        System.out.printf("Cat %s says 'Miaaauuu!'\n",name);
    }

}