public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("felis");

        Car car1 = new Car("VW","Polo" , 2000.0);








        Human me = new Human(1888);
        Human sister = new Human(1990);

        me.pet = cat;

        me.setSalary(4000.0);

        me.getSalary();

        me.setCar(car1);
        me.getCar();









 }
}