public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("felis");

        Car car1 = new Car("VW","Polo");

        Car car2 = new Car("Audi","A8");

        Car car3 = new Car("Fiat","Panda");

        Car car4 = new Car("Fiat","Panda");

        car2.isRun = false;
        car2.color = "green";
        car2.course = 50000.0;




        Human me = new Human(1888);
        Human sister = new Human(1990);

        me.pet = cat;
        me.setSalary(5000.0);
        me.setSalary(5000.0);

        me.getSalary();








 }
}