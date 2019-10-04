import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 
public class Date {
 
    public static void main(String[] args) {
        String utcDateStr = "2018-07-31";
        try {
            convert(utcDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    public static void convert(String dateString) throws ParseException {
        System.out.println("Given date is " + dateString);
 
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(dateString);
 
        System.out.println("dd/mm/yyyy formatted date : " + new SimpleDateFormat("dd/MM/yyyy").format(date));
        System.out.println("yyyy-MM-dd formatted date : " + new SimpleDateFormat("yyyy-MM-dd").format(date));
 
    }
}

