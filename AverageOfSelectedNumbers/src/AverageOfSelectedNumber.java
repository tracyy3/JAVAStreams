import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> inputs = new ArrayList<>();
            System.out.println("Input numbers, type \"end\" to stop");
            while (true) {
                String row = scanner.nextLine();
                if (row.equals("end")) {
                    break;
                }
                inputs.add(row);
            }

            System.out.println("Print the average of the negative numbers of the positive numbers? (n/p)");
            String reply = scanner.nextLine();
            if (reply.equalsIgnoreCase("p")) {
                double average = inputs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average number: " + average);

            } else {
                double average = inputs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average number: " + average);
            }
        }
    }
}
