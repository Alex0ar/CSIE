package acs.ase.ro.dpcomportamentale.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void sendNotification(String message){
        for(Observer observer:observerList){
            observer.receiveNotification(message);
        }
    }
}
