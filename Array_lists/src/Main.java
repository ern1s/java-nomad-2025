public class Main {
    public static void main(String[] args) {
        StudentArrayList lessons = new StudentArrayList();
        lessons.add("Variables");
        lessons.add("Conditions");
        lessons.add("Loops");
        lessons.add("Methods");

        System.out.println("Course topics:");
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println((i + 1) + ". " + lessons.get(i));
        }

        lessons.set(1, "If statements");
        lessons.remove(0);

        System.out.println("
After changes:");
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println("- " + lessons.get(i));
        }

        System.out.println("
Contains 'Methods'? " + lessons.contains("Methods"));
    }
}
