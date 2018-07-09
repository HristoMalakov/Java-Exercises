package unit14.GSM;

public class GSM {

    private String model;
    private String manufacturer;
    private float price;
    private static GSM nokia95;

    public GSM(String model, String manufacturer, float price){
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public GSM(){
        this.model = null;
        this.manufacturer = null;
        this.price = 0.0f;
    }

    public static void getNokia95Info() {
        System.out.printf("The phone %s costs %.2f leva and is manufactured by %s" +
                "",nokia95.model,nokia95.price,nokia95.manufacturer);
    }

    public static void setNokia95Info(String model, String manufacturer, float price) {
        nokia95.model = model;
        nokia95.manufacturer = manufacturer;
        nokia95.price = price;
    }

    public String toString(){
        return "The phone "+this.model+" costs "+this.price+" dollars and is produced by "+this.manufacturer;
    }


}
