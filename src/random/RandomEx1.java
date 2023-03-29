package random;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rnd = new Random();
	
		int num = rnd.nextInt(100000, 999999);

		System.out.println("아래 인증 번호를 5분 이내에 입력해주세요.\n" + num);
	}
	
}
