import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DiasClasse {
	public int getData(String date1, String date2) {
		try {
			Locale.setDefault (new Locale ("pt", "BR"));
 
			String format = "dd/MM/yyyy";
 
			SimpleDateFormat sdf = new SimpleDateFormat(format);
 
			Date dateObj1 = sdf.parse(date1);
			Date dateObj2 = sdf.parse(date2);
 
			long diff = dateObj2.getTime() - dateObj1.getTime();
 
			return (int) (diff / (24 * 60 * 60 * 1000));
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
