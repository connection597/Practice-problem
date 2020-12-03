// Scanner를 이용하여 이름, 도시, 나이, 체중, 독신 여부를 입력 받고 다시 출력하는 프로그램을 작성
package javaTest;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("이름,도시,나이,체중,독신여부 입력");
		Scanner sc = new Scanner (System.in);
		String name =sc.next(); //문자열 읽기
		System.out.println("이름은"+name+ ",");
		String city =sc.next();
		System.out.println("도시는"+city+",");
		int age =sc.nextInt(); //정수 읽기
	    System.out.println("나이는"+age+",");
	    double weight =sc.nextDouble(); //실수 읽기
	    System.out.println("체중은"+weight+"kg,");
	    boolean single =sc.nextBoolean(); //논리 값 읽기
	    System.out.println("독신여부는 "+single+"입니다");
	    sc.close();

	}

}
