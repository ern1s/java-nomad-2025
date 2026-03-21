import java.util.ArrayList;
import java.util.Arrays;

public class FilterOdd {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 8, 11, 14, 19, 22, 25));
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        System.out.println("All numbers: " + numbers);
        System.out.println("Only odd numbers: " + oddNumbers);
    }
}
