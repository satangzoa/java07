package stringbuilderex;

public class StringBuilderEx1 {
	public static void main(String[] args) {
		String s1 = "";
		
		long from = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			s1 += "ABCD";
		}
		
		long to = System.currentTimeMillis();
		
		System.out.println("문자열의 길이: " + s1.length());
		System.out.println("소요시간: " + (to - from) + "ms");
		
		StringBuilder s2 = new StringBuilder();
		
		from = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			s2.append("ABCD");
		}
		
		to = System.currentTimeMillis();
		
		System.out.println("문자열의 길이: " + s2.length());
		System.out.println("소요시간: " + (to - from) + "ms");
	}
}





