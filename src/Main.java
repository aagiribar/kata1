import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("George", LocalDate.of(1994, 6, 8));
        System.out.println(person);
        System.out.println("George is " + person.getAge() + " years old");
    }
}
