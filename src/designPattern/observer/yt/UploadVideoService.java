package designPattern.observer.yt;

import java.util.ArrayList;
import java.util.List;

//publisher
public class UploadVideoService {
    private List<UploadVideoSubscribers> uploadVideoSubscribersList;

    public UploadVideoService(){
        this.uploadVideoSubscribersList = new ArrayList<>();
    }

    public void uploadVideo(){
        for(UploadVideoSubscribers uploadVideoSubscribers : uploadVideoSubscribersList){
            uploadVideoSubscribers.uploadVideoAction();
        }
    }

    public void addSubscriber(UploadVideoSubscribers subscriber){
        uploadVideoSubscribersList.add(subscriber);
    }

    public void removeSubscriber(UploadVideoSubscribers subscriber){
        uploadVideoSubscribersList.remove(subscriber);
    }

}
