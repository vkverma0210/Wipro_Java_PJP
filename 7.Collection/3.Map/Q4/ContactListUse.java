public class ContactListUse {
    public static void main(String[] args) {
        ContactList cl = new ContactList();

        cl.addContact("Ramkrishan", 99998888);
        cl.addContact("Abhishek", 88887777);
        cl.addContact("Akash", 77776666);

        System.out.println("Akash: " + cl.ContactNameExist("Akash"));
        System.out.println("98765432: " + cl.ContactNumberExist(98765432));

        System.out.println();
        cl.allContacts();
    }

}