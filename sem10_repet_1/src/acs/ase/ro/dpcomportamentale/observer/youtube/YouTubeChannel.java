package acs.ase.ro.dpcomportamentale.observer.youtube;

public class YouTubeChannel extends Observabil{
    private String name;

    public YouTubeChannel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void uploadVideo(String title){
        sendNotification(name + " upload: " + title);
    }

}
