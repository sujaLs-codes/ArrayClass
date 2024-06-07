import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Date_Time {
    public static void main(String[] args) {
        Date current = new Date();

        LocalDate local = current.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        System.out.println(local);
    }
}
