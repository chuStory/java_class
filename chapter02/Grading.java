package chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 학점 출력
 * */

public class Grading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		A,B,C,D,F
		char grade;
		System.out.println("정수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		
		if (score >= 90) {
			grade='A';
		}else if (score >= 80) {
			grade='B';			
		}else if (score >= 70) {
			grade='C';			
		}else if (score >= 60) {
			grade='E';			
		}else {
			grade='F';			
		}
		System.out.println("학점은 "+grade+"입니다.");
		scanner.close();	
	}
}
