import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("
1 - add task");
            System.out.println("2 - show tasks");
            System.out.println("3 - delete task");
            System.out.println("0 - exit");
            System.out.print("Choose: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1 -> {
                    System.out.print("Task text: ");
                    tasks.add(scanner.nextLine());
                    System.out.println("Added.");
                }
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("Task list is empty.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                }
                case 3 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("Nothing to remove.");
                    } else {
                        System.out.print("Enter number: ");
                        int index = scanner.nextInt() - 1;
                        if (index >= 0 && index < tasks.size()) {
                            System.out.println("Removed: " + tasks.remove(index));
                        } else {
                            System.out.println("Wrong number.");
                        }
                    }
                }
                case 0 -> running = false;
                default -> System.out.println("Unknown menu item.");
            }
        }
    }
}
