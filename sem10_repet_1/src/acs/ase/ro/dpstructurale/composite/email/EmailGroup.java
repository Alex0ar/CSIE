package acs.ase.ro.dpstructurale.composite.email;

import java.util.ArrayList;
import java.util.List;

public class EmailGroup implements EmailReceiver{
    private List<EmailReceiver> receivers = new ArrayList<>();

    @Override
    public void receive(String message) {
        for(EmailReceiver receiver:receivers){
            receiver.receive(message);
        }
    }

    @Override
    public void addReceiver(EmailReceiver receiver) {
        receivers.add(receiver);
    }

    @Override
    public void deleteReceiver(EmailReceiver receiver) {
        receivers.remove(receiver);
    }

    @Override
    public List<EmailReceiver> getReceivers() {
        return List.copyOf(receivers);
    }

    @Override
    public void display(String indent){
        System.out.println(indent + "Group");
        for(EmailReceiver receiver:receivers){
            receiver.display(indent + " ");
        }
    }
}
