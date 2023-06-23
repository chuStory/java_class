package chapter02;

public class Cylinder {
	public static void main(String[] args) {
		double r=7;
		double h=5;
//		1.7,5를 가지고 메소드 호출
//		4.원기둥 부피를 v로 저장
		double v = volume(r, h);
		System.out.println("반지름이 "+r+", 높이가 "+h+"인 원기둥의 부피: "+v);
	}
//	매개변수가 2개인 메소드(원기둥 부피 구하기)
//	2.7을 radius, 5를 height로 받는다.
	public static double volume(double radius, double height) {
//		Math.PI : Math 클래스에 PI 속성
//	3.7: radius, 5:height를 가지고 계산해서 반환
		return Math.PI*radius*radius*height;
	}
}
