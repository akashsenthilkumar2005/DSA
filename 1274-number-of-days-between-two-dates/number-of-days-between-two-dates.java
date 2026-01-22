import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        String[] a = date1.split("-");
        String[] b = date2.split("-");

        LocalDate d1 = LocalDate.of(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
        LocalDate d2 = LocalDate.of(Integer.parseInt(b[0]), Integer.parseInt(b[1]), Integer.parseInt(b[2]));

        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
