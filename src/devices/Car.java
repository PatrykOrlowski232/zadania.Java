package devices;

public class Car extends Device {


    String color;
    Double course;
    Boolean isRun;

    public Double price;

    public Car(String producer, String model , String yearofProduction , Double price) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearofProduction;
        this.price = price;
    }
    public void turnOn(){
        this.isRun = true;

    }

}
