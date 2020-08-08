package patterns.behavioral.chainofresponsibility.orcking;

import org.apache.log4j.BasicConfigurator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChainOfResponsibilityTest {

    @BeforeTest
    public void before() {
        BasicConfigurator.configure();
    }

    @Test
    public void chainOfResponsibility() {

        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
