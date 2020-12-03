//아래 수열의 결과값을 구하는 프로그램을 작성하시오.
 //* 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = ? 
package javaTest;
public class Test2 {
	public static void main(String[] args) {
		int sum =0; // 입력
		for(int i =0; i<100; i++) {
			if(i%2 !=0) {//홀수 이면
				sum +=i;
			}else {
				sum -=i;
			}
	}
		System.out.println("Result:"+sum);
	}
}
