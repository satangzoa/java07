package objectex;

public class ObjectEx1 {
	public static void main(String[] args) {
		Car c1 = new Car("소나타");
		Car c2 = new Car("그랜저");
		
		System.out.println("두 자동차의 비교 결과: " + c1.equals(c2));
	}
}

class Car {
	private String modelName;
	
	Car(String modelName) {
		this.modelName = modelName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Car 객체가 아닌 다른 객체인 경우 false로 간주
		if (!(obj instanceof Car))
			return false;
		
		Car other = (Car)obj;
		
		// 내 모델명과 상대 Car 객체의 모델명을 비교
		if (modelName.equals(other.modelName))
			return true;
		else
			return false;
	}
	
}
