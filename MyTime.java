import java.time.LocalDate;
import java.time.Period;

public class MyTime {

	public static void main(String[] args) {
		LocalDate current = LocalDate.now();
		System.out.println("Today is " + current.getDayOfWeek() + " " + current.getMonth());
		
		LocalDate startOfSemester = LocalDate.of(2017, 8, 14);
		System.out.println("Semester started " + startOfSemester.getDayOfWeek() + " " + startOfSemester.getMonth());
		
		Period p = Period.between(startOfSemester, current);
		System.out.println("Is is " + p.getMonths() + " months and " + p.getDays() + "days since the start of the semester");
		
	}

}
