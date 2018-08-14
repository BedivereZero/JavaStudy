import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyyMMdd:hhmmss a zzz");
        System.out.println("Current Date: " + ft.format(date));
    }
}
