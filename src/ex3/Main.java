package ex3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {

        newContact("Gerry", "34567542");
        newContact("Scotti", "616416");
        newContact("Unica", "21423423");
        newContact("Religione", "1324123");
//        System.out.println(contacts);
        removeByName("Religione");
        System.out.println(contacts);

        returnContactByNumber("34567542");
        returnContactByName("Scotti");

        stampAllContacts();

    }

    public static void newContact(String name, String number) {
        contacts.put(name, number);
    }

    public static void removeByName(String name) {
        contacts.remove(name);
    }

    public static void returnContactByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                System.out.println("Contact found: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void returnContactByName(String name) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println("Contact found: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void stampAllContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
    }
}
