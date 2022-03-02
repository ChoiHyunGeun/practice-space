package test;

public class Lambda {

	public static void main(String[] args) {
		Calc minNum = (x, y) -> x < y ? x : y; // 추상 메소드의 구현
		 System.out.println(minNum.min(3, 4));  // 함수형 인터페이스의 사용
	}

}
