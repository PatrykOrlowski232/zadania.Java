import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");

        Car car1 = new Car("VW","Polo" , "2022" , 2000.0);
        Car car2 = new Car("VW","Polo" , "2012" , 5000.0);
        Phone phone1 = new Phone("Iphone","14","2022");








        Human me = new Human(1888);
        me.firstName = "Patryk";
        Human sister = new Human(1990);

        sister.cash = 1000.0;
        me.cash = 0.0;
        me.pet = dog;

        me.setSalary(4000.0);

        System.out.println(sister.pet);
        System.out.println(me.pet);

        dog.sell(me,sister,500.0);
        dog.sell(me,sister,500.0);
        System.out.println(sister.pet);
        System.out.println(me.pet);









 }
}