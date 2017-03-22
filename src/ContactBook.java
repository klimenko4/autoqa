package src;

import java.util.ArrayList;

/**
 * Created by Maxim Klimenko on 22.03.2017.
 */
public class ContactBook {

       private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
