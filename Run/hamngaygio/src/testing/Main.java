package testing;

import java.sql.Date;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//
	Locale lc=new Locale("vn");
	NumberFormat numf= NumberFormat.getCurrencyInstance(lc);
	long t1 = System.currentTimeMillis();
	for (int i=0;i<10;i++) {
		System.out.println("test");
	}
	long t2 = System.currentTimeMillis();
	System.out.println("thoi gian chay for "+(t2-t1));
	//
	System.out.println("3000 nam = "+numf.format(TimeUnit.DAYS.toSeconds(25*60)));
	//
java.util.Date d = new java.util.Date(System.currentTimeMillis());
System.out.println(d.getDate());
	//
	Calendar c= Calendar.getInstance();
	System.out.println(c.get(Calendar.DATE));
	System.out.println(c.get(Calendar.MONTH)+1);
	
	
}
}
