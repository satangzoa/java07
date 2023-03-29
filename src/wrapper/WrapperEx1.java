package wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = 200;
		
//		 두 가지 방법으로 wrapper 객체로 부터 기본형 값을 읽을 수 있음
		int n1 = i1.intValue();
		int n2 = i1;
		
		
		System.out.println("i1: " + n1);
		System.out.println("i1: " + n2);
	}
}
