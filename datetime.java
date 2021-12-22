package clock;
import java.time.LocalTime; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class datetime {
	void time()
	{
	    LocalTime myTimeObj = LocalTime.now();
	    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedTime = myTimeObj.format(myFormatTime);
	    JOptionPane.showMessageDialog(null,formattedTime);
	    
	}
	void date()
	{
		LocalDate myDateObj = LocalDate.now();
	    DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String formattedDate = myDateObj.format(myFormatDate);
	    JOptionPane.showMessageDialog(null,formattedDate);
	}
}