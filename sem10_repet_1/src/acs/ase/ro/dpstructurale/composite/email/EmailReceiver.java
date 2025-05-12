package acs.ase.ro.dpstructurale.composite.email;

import java.util.List;

public interface EmailReceiver {
    void receive(String message);
    void addReceiver(EmailReceiver receiver);
    void deleteReceiver(EmailReceiver receiver);
    List<EmailReceiver> getReceivers();
    void display(String indent);
}
