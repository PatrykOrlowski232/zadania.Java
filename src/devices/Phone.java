package devices;

public class Phone {
    String producer;
    String model;
    Double price;

    public String ToString()
    {
        return("producent:"+ producer + " Model:"+ model + " Cena:" + price );
    }

    public Phone (String producer  , String model , Double price)
    {
        this.producer = producer;
        this.model = model;
        this.price = price;


    }


}
