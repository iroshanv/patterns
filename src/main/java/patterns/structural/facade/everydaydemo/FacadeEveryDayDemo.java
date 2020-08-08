package patterns.structural.facade.everydaydemo;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEveryDayDemo {

    @Test
    public void facadeEveryDayDemo() throws Exception{

        // facade
        URL url = new URL("https", "www.pluralsight.com", 80,
                "/author/bryan-hansen");

        //decorator
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

    }
}
