package localdate;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateEx1 {
	public static void main(String[] args) {
		String birthday = "1982-08-29T00:00:00";
		LocalDateTime birth = LocalDateTime.parse(birthday);
		LocalDateTime now = LocalDateTime.now(); // 오늘날짜 구하기
		
		System.out.println("현재 날짜: " + now);
		
		// 두 날짜 간의 간격
		Duration diff = Duration.between(birth, now);
		System.out.println("지금까지 산 일수: " +  diff.toDays());
		
		String future = now.plusDays(100).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
		System.out.println("100일 후: " + future);
		
		
		
	}
}
