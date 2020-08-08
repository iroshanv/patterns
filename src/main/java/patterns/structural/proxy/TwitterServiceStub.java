package patterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "my neato time line";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
    }
}
