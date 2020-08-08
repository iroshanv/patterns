package patterns.behavioral.interpretor;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEveryDayDemo {

    @Test
    public void InterpreterEveryDayDemo() {
        String input = "Lions, and tigers, and bears! oh, my!";

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|human|tiger|liger|Lion)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a " + m.group() +".");
        }
    }

}
