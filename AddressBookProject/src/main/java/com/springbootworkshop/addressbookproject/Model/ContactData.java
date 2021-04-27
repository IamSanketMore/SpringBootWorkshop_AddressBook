package com.springbootworkshop.addressbookproject.Model;

public class ContactData {
    private int contactId;
    private String firstName;
    private String lastName;
    private String gender;
    private int mobileNumber;
    private String emailID;


    public ContactData(int contactId, ContactData contactData) {
        super();
        this.contactId = contactId;
        this.firstName = contactData.firstName;
        this.lastName = contactData.lastName;
        this.gender = contactData.gender;
        this.mobileNumber = contactData.mobileNumber;
        this.emailID = contactData.emailID;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
}