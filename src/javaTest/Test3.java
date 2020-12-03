package javaTest;
public class Test3 {
	public static void main(String[] args) {
		int[] score = {75,20,36,40,69}; //5명의 점수
		int sum =0; //총점:각점수를 누적할 변수
		int sumCondition =0; //조건총점 :특정조건에 맞는 학생의 점수를 누적할 변수
		
		for(int i =0; 0<score.length; i++) {
			sum+=score[i]; //전체총점
			
			if(score[i]>=80) { //80점 이상의 총점
				sumCondition +=score[i];
			}
		}
		System.out.println(score.length+"명의 총점:"+ sum);
		System.out.println(score.length+"명의 점수중 80점 이상의 총점"+sumCondition);

	}

}
