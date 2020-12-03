package javaTest;
//반지름이 10.0인 원의 면적을 구하시오. 원의 넓이 구하는 공식은 반지름*반지름*파이로 계산
public class JavaTest {
	public static void main(String[] args) {
		final double PI = 3.14; //원주율 선언,상수
		double radius =10.0; //원의 반지름
		double circleArea = radius*radius*PI; // 면적
		System.out.println("원의 면적은" + circleArea);
	}

}
