package devices;

public abstract class Device {
     String producer;
    String model;

    String yearOfProduction;

    Boolean isRun;

    public String ToString()
    {
        return("producent:"+ producer + " Model:"+ model + " Rok produkcji:" + yearOfProduction + " Czy włączony:"+ isRun);
    }

    public abstract void  turnOn();

}
