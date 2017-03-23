package src;

import java.util.ArrayList;

public class ContactBook {

       private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public String findContactByName(String name) {
        String  contact = "";
        for (int i = 0; i < contacts.size(); i++) {
            if ( contacts.get(i).getContactName().contains(name)) {
               contact = contacts.get(i).getContactName() + " " + contacts.get(i).getNumber();
               System.out.println(contact);
            }
        }
        return contact;
    }

    public void removeLast() {
        this.contacts.remove(this.contacts.size()-1);
    }

    public String showAllContacts(){
        String  contact = "";
        for (int i = 0; i < contacts.size(); i++) {
                contact = contacts.get(i).getContactName() + " " + contacts.get(i).getNumber();
                System.out.println(contact);
        }
        return contact;
    }


}
