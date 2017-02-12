package JavaFundamentals.calendar;

import java.time.*;

/**
 * Created by m.losK on 2017-02-12.
 * based on Cay Horstmann's code
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        int month = dateNow.getMonthValue();
        int today = dateNow.getDayOfMonth();
        LocalDate dateAtTheBeginningOfTheMonth = dateNow.minusDays(today - 1);
        int value = getValueOfTheWeekDay(dateAtTheBeginningOfTheMonth);
        printCalendar(dateAtTheBeginningOfTheMonth, value, month, today);
    }

    public static int getValueOfTheWeekDay(LocalDate date) {
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); //1 = poniedzialek, .. 7 = niedziela
        return value;
    }

    public static void printCalendar(LocalDate date, int value, int month, int today) {
        System.out.println(" Pn  Wt  Sr  Czw  Pt  So  N");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
