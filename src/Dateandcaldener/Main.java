package Dateandcaldener;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date  date= new Date(126,9,10);
		Date d= new Date();
		System.out.println(date);
int dates=date.getDate();
		System.out.println(dates);
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear()+1900); // 1900+126
		System.out.println(date.before(d));
		System.out.println(date.after(d));
		
		
Calendar calender	=	Calendar.getInstance();
//calender.set(2026, calender.JANUARY, 16);

calender.set(2024,9,17,17,30);
System.out.println(calender.getFirstDayOfWeek());
System.out.println(calender.getCalendarType());//
System.out.println(calender.getTimeInMillis());
System.out.println(calender.getWeekYear());

System.out.println(calender.getWeeksInWeekYear());
System.out.println(calender.getTime());
System.out.println(calender.getTimeZone());
		
	}

}
