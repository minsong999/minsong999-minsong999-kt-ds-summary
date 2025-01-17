package simple_example;

public class SimpleExample {

	public static void main(String[] args) {
		// 변수
		int a = 0;
		a = 0;
		int j = 0;
		long z = 3124587878848455L;
		float ff = 3.14172F;

		char abc = 'a';
		char fed = 97;
		boolean t = true;
		boolean f = false;

		// 상수
		final int NEVERCHANGE;
		NEVERCHANGE = 1;
		// NEVERCHANGE=1; //상수 재할당 불가

		// 명시적형변환 -- 오버플로우 유의할 것
		long bigNumber = Integer.MAX_VALUE + 1L;
		int normalNumber = (int) bigNumber;

		// 자바의 소수점 처리 곱하여 정수단에서 처리 후 나누어줌
		double dnum = 29.37112;
		double dnum2 = dnum * 100;
		System.out.println(dnum2);
		double dnum3 = Math.round(dnum2);
		double dnum4 = dnum3 / 100;
		System.out.println(dnum4);

		double dnum5 = (double) (Math.round(dnum * 100)) / 100;

		// 산술연산자 =,+,-,*,/,%,++,-- 괄호-제곱-곱-나누기-더하기-빼기-왼쪽에서오른쪽으로
		// 비교연산자 ==,<,<=,>=,>,!=
		// 논리연산자 &&,||,! --데드코드 활용할 것

		// if문
		if (a == j) {
			// if문의 조건이 true 경우 실행
		} else if (j == a) {
			// 앞에 조건이 모두 false,해당 else if문 true일 경우 실행
		} else {
			// else일 경우 실행
		}

		// switch문
		int switchValue = 0;
		switch (switchValue) {
		case 0:
		case 1:
			break;
		case 2:
		default:
		}
		
		// while문
		while(1==1) {
			break;
		}
		
		//for문 초기값 생성 -> 반복코드 -> 증감식 -> 반복조건 -> 반복코드 -> ...
		for(int i = 0; i < 10; i++) {
			
		}

	}

}
