package day14;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 클래스
		// Date 클래스 => Deprecated (비권장)
		// Calendar 클래스 / LocalDate 클래스
		Date d = new Date();
		System.out.println(d); // 오늘 날짜
		System.out.println(d.getDate()); // 오늘 날짜
		
		Calendar c =  Calendar.getInstance(); // 추상클래스 new로 객체 생성 불가능
		int year = c.get(Calendar.YEAR); // 멤버변수 static final
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month+1);// 0~11
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year+"-"+(month+1)+"-"+day);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(datetime.getYear());
		System.out.println(datetime.getMonth());
		System.out.println(datetime.getMonthValue());
		System.out.println(datetime.getDayOfMonth());
		System.out.println(datetime.toLocalDate());
		
		LocalDateTime birth = LocalDateTime.of(2009, 9, 30, 8, 30);
		System.out.println(birth);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
		// 두 객체 사이 간격
		long days = ChronoUnit.DAYS.between(birth, datetime); // 일 차이
		System.out.println(days);
		long months= ChronoUnit.MONTHS.between(birth, datetime); // 개월차이
		System.out.println(months);
		
		Duration.between(datetime, birth); // 두 시간 사이 간격
		
		Period.between(date, date); // 두 날짜 사이 간격
	}

}
