package services.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DataAleatoria {
	  
      public static Date dataAleatoria() {
		  
	        GregorianCalendar gc = new GregorianCalendar();
	        int year = randBetween(1900, 2025);
	        gc.set(gc.YEAR, year);
	        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
	        gc.set(gc.DAY_OF_YEAR, dayOfYear);
    
	        return (new Date(gc.get(gc.YEAR) - 1900, gc.get(gc.MONTH), gc.get(gc.DAY_OF_MONTH))); 
	  
	    }

	    public static int randBetween(int start, int end) {
	        return start + (int)Math.round(Math.random() * (end - start));
	    }
}
