import java.util.Calendar;
import java.util.Date;

public class Main {

    static JavaUtil javaUtil = new JavaUtil();

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.set(2017,10,30);
        c.set(2017, Calendar.MAY, 30);
        Date  date= c.getTime();

        System.out.println(date);

        //javaUtil.printProperties();

    }
}
