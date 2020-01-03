import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyTime {
    private String time;
    SimpleDateFormat sdf = new SimpleDateFormat( "hh시mm분ss초");

    public MyTime(){
        time = sdf.format(Calendar.getInstance().getTime());
    }

    public String toString(){
        return time;
    }
}
