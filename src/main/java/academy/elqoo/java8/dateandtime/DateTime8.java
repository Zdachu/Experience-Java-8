package academy.elqoo.java8.dateandtime;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DateTime8 {

    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate goToFirstOfNextMonth(LocalDate inputDate) {

        if (inputDate.getMonth() == Month.DECEMBER) {
            return LocalDate.of(inputDate.getYear() + 1, Month.JANUARY, 1);
        } else {
            return LocalDate.of(inputDate.getYear(), inputDate.getDayOfMonth() + 1, 1);
        }
    }

    public static void RetrieveDateInformationUsingChronoFields(LocalDate inputDate){
        int year = inputDate.get(ChronoField.YEAR);
        int month = inputDate.get(ChronoField.MONTH_OF_YEAR);
        int day = inputDate.get(ChronoField.DAY_OF_MONTH);
    }

    public static LocalDate goToFirstOfNextMonth2(LocalDate inputDate) {

        return inputDate.plusMonths(1).withDayOfMonth(1);
    }


    public static LocalDate findNextFriday13th(LocalDate from) {
        throw new NotImplementedException();
    }

}
