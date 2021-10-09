package corejavaconcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateclassDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//current date and current time
		Date d=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		//MM-month,dd-day,yyyy-year)
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		//(hh-hour,mm-minute,ss-seconds )
		
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		System.out.println(sdf.getTimeZone());
		//System.out.println(sdf.getInstance());
	
	}

}
