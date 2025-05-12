package acs.ase.ro.dpstructurale.composite.email;

import java.util.List;

public class EmailAddress implements EmailReceiver{
    private String name;

    public EmailAddress(String name) {
        this.name = name;
    }

    @Override
    public void receive(String message) {
        System.out.println(name + ": " + message);
    }

    @Override
    public void addReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<EmailReceiver> getReceivers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(String indent){
        System.out.println(indent + "address: " + name);
    }
}
