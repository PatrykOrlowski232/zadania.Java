package devices;

public class Phone extends Device {

    Double price;



    public Phone (String producer  , String model , String yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;


    }

    public void turnOn(){
        this.isRun = true;

    }


}
