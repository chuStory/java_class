package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue=44032;
//		int 타입을 char로 바로 저장할려고 하면 오류		
//		char charValue=intValue;
//		char로 변환(casting)해서 저장
//		44032 유니코드에 해당하는 '가' 문자가 저장
		char charValue=(char) intValue;
		System.out.println(charValue);
		
//		기본은 int 타입
//		5000999888L에서 L을 안붙이면 int로 인식해서 오류(int 범위 벗어남)
//		long longValue=5000999888;
		long longValue=5000999888L;
//		정수 큰타입에서 작은 타입으로 변환(변환 안하면 오류)
//		long 타입 숫자가 int로 변환할때 잘려서 706032592로 저장
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue=3.14;
//		실수에서 정수로 변환(변환안하면 오류)
//		3.14에서 소수점이 잘려서 3으로 저장
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
	}

}
