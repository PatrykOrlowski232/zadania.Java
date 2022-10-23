public class Animal implements Selleable {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    final String species;
    String name;
    Boolean isAlive;
    private Double weight;

    public Animal(String species) {
        this.isAlive = true;
        this.name = "Szarik";
        this.species = species;

        switch (species) {
            case "canis":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "felis":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "elephant":
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
                break;
        }
    }

    public void feed() {
        this.weight += 1.0;
        System.out.println("Zwierze przytyło");
    }

    public void takeAWalk() {
        this.weight -= 1.0;
        System.out.println("Zwierze zgubiło mase");
        if (this.weight <= 0) {
            this.isAlive = false;
            System.out.println("Zwierze umarło");

        }
    }


    public String ToString() {
        return ("Imie:" + name + " gatunek:" + species + " waga:" + weight);
    }

   public  void sell(Human seller, Human buyer, Double price) {
        if (this == seller.pet) {
            if (buyer.cash >= price)
            {
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = this;
                seller.pet = null;
                System.out.println("Zwierze "+this.species+" zostało sprzedane");

            } else System.out.println("Kupujący nie ma wystarczająco gotówki");

                                    } else System.out.println("Sprzedający nie posiada tego zwierzęcia");

    }
}

