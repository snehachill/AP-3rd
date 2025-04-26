import java.util.ArrayList;
import java.util.HashMap;

public class AddressBook {
    private HashMap<String, String> contacts;
    private ArrayList<String> names;

    public AddressBook() {
        contacts = new HashMap<>();
        names = new ArrayList<>();
    }

    public void addContact(String name, String address) {
        contacts.put(name, address);
        names.add(name);
    }

    public String getAddress(String name) {
        return contacts.get(name);
    }

    public void listContacts() {
        for (String name : names) {
            System.out.println(name + ": " + contacts.get(name));
        }
    }
}