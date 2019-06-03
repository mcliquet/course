package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//instancia��o do formato de data
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();//instancia com horario atual
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:17");
		
		System.out.println(x1);//hor�rio atual
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		System.out.println();
		System.out.println(y1);
		System.out.println(sdf2.format(x1));
		System.out.println(y2);
		

	}

}
