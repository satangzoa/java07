package stringex;

public class StringEx1 {
	public static void main(String[] args) {
		String path = "C:\\Users\\A\\Desktop\\교재\\aaa.txt";
		String fileName = path.substring(path.lastIndexOf("\\") + 1);
		System.out.println("파일이름: " + fileName);
		
		int v1 = 1234;
		// 기본형 값을 문자열로 변경하는 두가지 방법
		String s1 = String.valueOf(v1);
		String s2 = v1 + "";
	}
}
