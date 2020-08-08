package patterns.structural.decorator.everydaydemo;

import org.testng.annotations.Test;

import java.io.*;

public class DecoratorEveryDayDemo {

    @Test
    public void decoratorEveryDayDemo() throws Exception {

        File file = new File("./ouptut.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        outputStream.close();

    }
}
