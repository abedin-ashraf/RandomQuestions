import java.util.*;
import java.util.GregorianCalendar;

public class TestCalender {
    public static void main(String[] args){
        Calendar calender = new GregorianCalendar();

        System.out.println("Current time is "+new Date());
        System.out.println("Year: "+calender.get(Calendar.YEAR));
        System.out.println("Month: "+calender.get(Calendar.MONTH));
        System.out.println("Date: "+calender.get(Calendar.DATE));
        System.out.println("HOUR: " + calender.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calender.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calender.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calender.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " + calender.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " + calender.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calender.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calender.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calender.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calender.get(Calendar.AM_PM));

        // Construct a calendar for December 25, 1997
        Calendar calendar1 = new GregorianCalendar(1997, 11, 25);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("December 25, 1997 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
