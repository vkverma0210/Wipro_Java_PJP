import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class ContactList {
    HashMap<String, Integer> contacts = new HashMap<>();

    public void addContact(String name, Integer phnumber) {
        contacts.put(name, phnumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    @Override
    public String toString() {
        return "Contact List: - [" + contacts + "]";
    }

    public boolean ContactNameExist(String name) {
        Set<Entry<String, Integer>> set = contacts.entrySet();
        Iterator<Entry<String, Integer>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<String, Integer> e = itr.next();

            if (e.getKey().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public boolean ContactNumberExist(Integer number) {
        Set<Entry<String, Integer>> set = contacts.entrySet();
        Iterator<Entry<String, Integer>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<String, Integer> e = itr.next();

            if (e.getValue().intValue() == number) {
                return true;
            }
        }

        return false;
    }

    public void allContacts() {
        Set<Entry<String, Integer>> set = contacts.entrySet();
        Iterator<Entry<String, Integer>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<String, Integer> e = itr.next();

            System.out.println(e);
        }
    }
}
