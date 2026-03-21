import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter points for module: ");
        int points = scanner.nextInt();

        String grade;
        if (points >= 90) {
            grade = "A";
        } else if (points >= 75) {
            grade = "B";
        } else if (points >= 60) {
            grade = "C";
        } else if (points >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name + ", your module grade is: " + grade);
    }
}
