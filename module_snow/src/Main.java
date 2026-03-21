import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int snowballs = 10;
        int totalWeight = 0;

        System.out.println("Snow module simulation:");
        for (int i = 1; i <= snowballs; i++) {
            int weight = 1 + random.nextInt(9);
            totalWeight += weight;
            System.out.println("Snowball " + i + " weight: " + weight);
        }

        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight: " + (double) totalWeight / snowballs);
    }
}
