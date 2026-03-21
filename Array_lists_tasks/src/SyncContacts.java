import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SyncContacts {
    public static void main(String[] args) {
        ArrayList<String> phoneContacts = new ArrayList<>();
        phoneContacts.add("Aibek");
        phoneContacts.add("Nursultan");
        phoneContacts.add("Aibek");
        phoneContacts.add("Amina");

        LinkedHashSet<String> uniqueContacts = new LinkedHashSet<>(phoneContacts);

        System.out.println("Before sync: " + phoneContacts);
        System.out.println("After sync: " + uniqueContacts);
    }
}
