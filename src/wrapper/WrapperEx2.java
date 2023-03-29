package wrapper;

public class WrapperEx2 {
	public static void main(String[] args) {
		String s1 = "12";
		String s2 = "34";
		
		int v1 = Integer.parseInt(s1);// Integer는 static 메서드//문자열을 정수로 변환
		int v2 = Integer.parseInt(s2);
		
		System.out.println(v1 + v2);
	}
}
