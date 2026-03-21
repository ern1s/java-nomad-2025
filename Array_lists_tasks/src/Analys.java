import java.util.ArrayList;
import java.util.Scanner;

public class Analys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        int sum = 0;
        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int number : numbers) {
            sum += number;
            if (number > max) max = number;
            if (number < min) min = number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
