package com.example.recyclerview_192023assignment;

public class Contact {
    String Name;
    String Identity;
    String Message;

    public Contact(String name, String identity, String message) {
        Name = name;
        Identity = identity;
        Message = message;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
