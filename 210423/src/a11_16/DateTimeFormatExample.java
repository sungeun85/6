import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter =
				DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String onwString = now.format(dateTimeFormatter);
	      System.out.println(nowString);
	}
}