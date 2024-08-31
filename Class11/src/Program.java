import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-06-12");
		LocalDateTime d05 = LocalDateTime.parse("2222-02-22T17:43:03");
		Instant d06 = Instant.parse("2222-02-22T01:30:03z");
		Instant d07 = Instant.parse("2222-02-22T17:43:03-03:00");
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d09 = LocalDate.parse("20/06/2024", fm1);
		
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d10 = LocalDateTime.parse("20/03/2024 13:44", fm2);
		
		LocalDate d11 = LocalDate.of(2024, 06,22);
		LocalDateTime  d12 = LocalDateTime.of(2024, 06, 11, 20, 30);
		
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		//*for (String s :ZoneId.getAvailableZoneIds()) {
			//System.out.println(s);
		//}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		ZonedDateTime r3 = ZonedDateTime.ofInstant(d06, ZoneId.systemDefault());
		ZonedDateTime r4 = ZonedDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println(d10);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d07);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(fm2 + "AQEUI");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println("D04 dia = " + d04.getDayOfMonth());
		System.out.println("D04 mês = " + d04.getMonthValue());
		System.out.println("D04 ano = " + d04.getYear());
		System.out.println("D05 Hora = " + d05.getHour());
		System.out.println("D05 Minuto = " + d05.getMinute());
		
		
		
		
		sc.close();
	}

}
