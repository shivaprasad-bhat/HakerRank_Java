import java.io.*;
import java.time.LocalDate;
import java.util.*;

class Result {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

}

public class GetDayOfDate {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);
        sc.close();
        System.out.println(res);
    }
}
