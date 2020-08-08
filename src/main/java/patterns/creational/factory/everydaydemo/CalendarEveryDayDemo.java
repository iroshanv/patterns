package patterns.creational.factory.everydaydemo;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEveryDayDemo {

    @Test
    public void calendarEveryDayDemo() {

        Calendar calendar = Calendar.getInstance();
//        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone(""));
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DATE));

    }
}
