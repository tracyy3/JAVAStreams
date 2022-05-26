import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        System.out.println("Please enter: First Name, Last name, and Birth Year.");
        while (true) {
            System.out.println("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter Birth Year:");

            int birthYear = Integer.parseInt(scanner.nextLine());
            persons.add(new Person(firstName, lastName, birthYear));

            System.out.println("Continue information input? \"quit\" ends");
            String info = scanner.nextLine();

            if (info.equalsIgnoreCase("quit")) {
                break;
            }
        }

        persons.stream()
                .map(Person::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}