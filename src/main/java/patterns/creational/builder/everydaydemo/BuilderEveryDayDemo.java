package patterns.creational.builder.everydaydemo;

import org.testng.annotations.Test;

public class BuilderEveryDayDemo {

    @Test
    public void builderEveryDayDemo() {

        StringBuilder builder = new StringBuilder();
        builder.append("this is an example")
                .append(" of the builder pattern")
                .append(" 42");

        System.out.println(builder.toString());


    }
}


