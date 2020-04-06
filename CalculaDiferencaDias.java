import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
 
public class CalculaDiferencaDias {
 
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			Locale.setDefault (new Locale ("pt", "BR"));
			System.out.println("Primeira data (dd/MM/yyyy): ");
			String date1 = sc.nextLine();
			System.out.println("Segunda data (dd/MM/yyyy): ");
			String date2 = sc.nextLine();
 
			String format = "dd/MM/yyyy";
 
			SimpleDateFormat sdf = new SimpleDateFormat(format);
 
			Date dateObj1 = sdf.parse(date1);
			Date dateObj2 = sdf.parse(date2);
 
			long diff = dateObj2.getTime() - dateObj1.getTime();
 
			int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
			System.out.println("Diferença entre dias: " + diffDays);
			
			sc.close();
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}