package patterns.creational.factory.websitefactory;

import org.testng.annotations.Test;
import patterns.creational.factory.WebsiteType;

public class WebFactoryDemo {

    @Test
    public void webFactoryDemo() {

        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());

    }
}
