package patterns.structural.proxy;

import org.testng.annotations.Test;

public class TwitterDemo {

    @Test
    public void twitterDemo() {
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
//        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(twitterService.getTimeline("twitterHandle"));

        twitterService.postToTimeline("twitterHandle", "some message");

    }
}
