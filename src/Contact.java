package src;

public class Contact {

    private String contactName;
    private String number;


    public Contact(String contactName, String number) {
        this.contactName = contactName;
        this.number = number;
    }

    public String getContactName() {
        return contactName;
    }

    public String getNumber() {
        return number;
    }
}