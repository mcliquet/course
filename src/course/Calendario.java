package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//----------------------------------------------
		//obtendo unidade de tempo
		
		SimpleDateFormat sdfg = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dg = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdfg.format(d));
		
		Calendar calg = Calendar.getInstance();
		
		calg.setTime(dg);
		
		int minutes = calg.get(Calendar.MINUTE);
		int month = 1 + calg.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
