package Problems;

import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
public class Problem47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat cdt =new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss:SSS");
	
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
	
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	
	}

}
