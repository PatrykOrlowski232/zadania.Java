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

        me.pet = dog;

        me.setSalary(4000.0);

        me.getSalary();

        me.setCar(car1);
        me.getCar();
        System.out.println(car2);
        System.out.println(car1.ToString());
        System.out.println(dog.ToString());
        System.out.println(me.ToString());
        phone1.turnOn();
        car1.turnOn();
        System.out.println(phone1.ToString());
        System.out.println(car1.ToString());









 }
}