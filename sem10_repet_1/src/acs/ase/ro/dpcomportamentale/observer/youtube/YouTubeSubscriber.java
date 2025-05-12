package acs.ase.ro.dpcomportamentale.observer.youtube;

public class YouTubeSubscriber implements Observer{
    @Override
    public void receiveNotification(String message) {
        System.out.println("Notification: " + message);
    }
}
