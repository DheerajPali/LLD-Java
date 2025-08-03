package designPattern.observer.yt;

public class Main {
    public static void main(String[] args) {
        UploadVideoService uploadVideoService = new UploadVideoService();
        VideoValidation videoValidation = new VideoValidation();
        FormatEncoder formatEncoder = new FormatEncoder();
        LanguageCaptionGeneration languageCaptionGeneration = new LanguageCaptionGeneration();
        YtFeedUpdate ytFeedUpdate = new YtFeedUpdate();

        uploadVideoService.addSubscriber(videoValidation);
        uploadVideoService.addSubscriber(formatEncoder);
        uploadVideoService.addSubscriber(languageCaptionGeneration);
        uploadVideoService.addSubscriber(ytFeedUpdate);

        uploadVideoService.uploadVideo();
        uploadVideoService.uploadVideo();
//        uploadVideoService.uploadVideo();

    }
}
