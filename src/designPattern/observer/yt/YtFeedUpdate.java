package designPattern.observer.yt;

public class YtFeedUpdate implements UploadVideoSubscribers{

    public void uploadVideoAction(){
        System.out.println("YT feed has updated");
    }
}
