import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Clean Code");
        books.add("Effective Java");
        books.add("Head First Java");

        System.out.println("Library list:");
        for (String book : books) {
            System.out.println("* " + book);
        }

        books.remove("Head First Java");
        books.add("Java Concurrency in Practice");

        System.out.println("
Updated list:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ") " + books.get(i));
        }
    }
}
