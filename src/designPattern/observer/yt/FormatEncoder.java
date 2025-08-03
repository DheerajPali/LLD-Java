package designPattern.observer.yt;

public class FormatEncoder implements UploadVideoSubscribers{
    public void uploadVideoAction(){
        System.out.println("Encoded video in different formats");
    }
}
