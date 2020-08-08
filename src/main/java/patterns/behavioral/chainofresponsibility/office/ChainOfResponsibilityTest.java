package patterns.behavioral.chainofresponsibility.office;

import org.testng.annotations.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void chainOfResponsibilityTest() {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);


    }
}
