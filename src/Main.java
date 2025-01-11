import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();


        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5)); // Не получает стипендию
        people.add(new Student("Paul", "McCartney", 3.5)); // Получает стипендию


        Collections.sort(people, (p1, p2) -> Double.compare(p1.getPaymentAmount(), p2.getPaymentAmount()));


        printData(people);
    }

    public static void printData(Iterable<Payable> list) {
        for (Payable p : list) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}
