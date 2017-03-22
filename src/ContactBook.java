package src;

import java.util.ArrayList;

/**
 * Created by Maxim Klimenko on 22.03.2017.
 */
public class ContactBook {

       private ArrayList<Contact> contacts = new ArrayList<Contact>();


    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
}
