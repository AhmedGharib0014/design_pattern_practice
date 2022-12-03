package structural.proxy;

public class TwitterServiceImpl implements TwitterService {
    @Override
    public String getTimeLine(String screenName) {
        return "my time Line content";
    }

    @Override
    public void postToTimeLine(String screenName, String message) {
        System.out.println(message);

    }
}
