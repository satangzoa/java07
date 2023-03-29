package objectex;

public class ObjectEx3 {
	public static void main(String[] args) {
		Dog d1 = new Dog("초코", Dog.성별.숫컷);
		Dog d2 = new Dog("예삐", Dog.성별.암컷);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		String s1 = d1 + "이 주인과 산책합니다.";
		System.out.println(s1);
		
		
		String s2 = d2 + "이 주인과 산책합니다.";
		System.out.println(s2);
	}
}

class Dog {
	// 성별은 숫컷 값과 암컷값만 가질 수 있는 새로운 성별 타입을 선언
	enum 성별 { 숫컷, 암컷 } //enum 열거형
	
	private String name;
	private 성별 gender; // 젠더 변수는 숫컷 또는 암컷만 가질 수 있다.
	
	Dog (String name, 성별 gender) {
		this.name = name;
		this.gender = gender;
	}
	
	// 이 객체가 문자열로 바뀌어야 할 때 호출되는 메써드
	@Override
	public String toString() {
		if (gender == 성별.숫컷)
			return name + "군";
		else
			return name + "양";
	
	}
}
