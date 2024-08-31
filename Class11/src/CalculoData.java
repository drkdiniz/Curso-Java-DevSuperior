import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoData {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-06-12");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-12T01:30:30");
		Instant d06 = Instant.parse("2024-06-12T01:30:30z");
		
		LocalDate pastweekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		Duration t01 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t02 = Duration.between(pastweekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t03 = Duration.between(nextWeekLocalDateTime, pastWeekLocalDateTime);
		
		
		
		
		
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("Past Week = " + pastweekLocalDate);
		System.out.println("Next week = " + nextWeekLocalDate);
		System.out.println("Past Week + Time = " + pastWeekLocalDateTime);
		System.out.println("Next Week + Time = " + nextWeekLocalDateTime);
		System.out.println("Past Week Instant = " + pastWeekInstant);
		System.out.println("Next Week Instant = " + nextWeekInstant);
		System.out.println("Duration T01 = " + t01.toDays());
		System.out.println("Duration T02 = " + t02.toDays());
		System.out.println("Duration T03 = " + t03.toDays());
	}

}
