package objectex;

public class ObjectEx2 {
	public static void main(String[] args) {
		Person p1 = new Person("12345-123456");
		Person p2 = new Person("12345-123456");
		Person p3 = new Person("42222-123456");
		
		System.out.println("해쉬코드값: " + p1.hashCode()); //해쉬코드는 객체의 고유값이다
		System.out.println("해쉬코드값: " + p2.hashCode());
		System.out.println("해쉬코드값: " + p3.hashCode());
	}
}

class Person {
	private String ssn;
	
	Person (String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public int hashCode() {
		return ssn.hashCode();

	}
}

