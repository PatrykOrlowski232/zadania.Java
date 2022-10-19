package devices;

public class Car {

    final String producer;

    final String model;
    String color;
    Double course;
    Boolean isRun;

    public Double price;

    public Car(String producer, String model , Double price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public String ToString ()
    {
        return ("Model:"+model + " Producent:" +producer+" Cena:"+price+"");
    }
}
