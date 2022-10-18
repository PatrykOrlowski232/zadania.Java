import com.sun.jdi.VoidType;

public class Human {
    String firstName;
    String lastName;
    Double salary;
    final Integer yearOfBirth;
    Car car;
    Animal pet;

    public Void getSalary ()
    {
        System.out.println(this.salary.toString());
        return null;
    }

    public Void setSalary(Double salary) {


        if (salary < 0) {
            System.out.println("Błąd , wartość nie może być ujemna");
            return null;

        } else {
            System.out.println("Dane trafiły do systemu księgowego");
            System.out.println("Proszę podejść do pani Kasi z kadr po nowy aneks");
            System.out.println("ZUS i US już o wszystkim wie");
            this.salary = salary;
            return null;
        }
    }
    Human(Integer yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
}
