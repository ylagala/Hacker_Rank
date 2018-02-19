import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.text.DateFormatter;


public class DateTimeExample {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2018,01,19,12,07,56);
		

		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);

		System.out.println(sdf.format(calendar.getTime()));

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
		
		// Finding period
		LocalDate birthday = LocalDate.of(1990,01,18);
		LocalDate today=LocalDate.now();
		Period p =Period.between(birthday,today);
		System.out.println("Your age is" + p.getYears()+" years " + p.getMonths() +" months " +p.getDays()+ " days" );

		
		int n = 2020;
		Year y=Year.of(n);
		if(y.isLeap())
		{
		  System.out.println(n+" year is Leap year");
		}
		else
		{
		  System.out.println(n+"year is not Leap Year");
		}
		
		
		// For fetching zone 
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		//For fetching Date and Time for diff zones 
		ZoneId la=ZoneId.of("America/Los_Angeles");

		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
		
		
		LocalTime time = LocalTime.now();
		int hour1 = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nanoSec = time.getNano();
		System.out.println(hour1);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(nanoSec);
		
		

	}

}
