import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Exercise12 {
	public static void main(String[] args){

		// specify dateFormat for output
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		// get current date time with Date()
		Date date = new Date();

		// output current date time
		System.out.println("The current date and time is: " + dateFormat.format(date));
	}
}