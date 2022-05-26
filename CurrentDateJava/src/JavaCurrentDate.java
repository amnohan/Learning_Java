import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaCurrentDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        //SimpleDateFormat is a source code to find out time/date/year;

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfWeekFormat.format(currentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("hh:mm a");
        System.out.println(clockFormat.format(currentDate));

        SimpleDateFormat yearOfYearFormat = new SimpleDateFormat("yyyy");
        System.out.println(yearOfYearFormat.format(currentDate));
    }
}
