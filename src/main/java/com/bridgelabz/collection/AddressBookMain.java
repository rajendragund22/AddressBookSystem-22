package com.bridgelabz.collection;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome into the Program of Address Book System !!");
        ContactDetails newContact = new ContactDetails();
        newContact.setFirstName("Rajendra\n");
        newContact.setLastName("Gund\n");
        newContact.setAddressCity("Shirdi\n");
        newContact.setState("Maharashtra\n");
        newContact.setEmail("rajendragund@gmail.com");
        newContact.setZip(414501);
        newContact.setPhoneNumber( 9604315270L);
        System.out.println("The Contact is :\n" +newContact);

    }
}
