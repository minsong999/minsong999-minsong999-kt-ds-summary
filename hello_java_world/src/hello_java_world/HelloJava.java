package hello_java_world;

public class HelloJava {
	/**
	 * Document (주석) 주석: 코드의 설명을 위한 영역, 코드 실행과는 관계가 없습니다. 
	 * @ java 파일을 실행시키기 위한 코드
	 */
	public static void main(String[] args) {
		/*
		 * Multiline 주석 주석: 코드의 설명을 위한 영역, 코드 실행과는 관계가 없습니다.
		 */

		// singleLine 주석
		// System.out.println("Hello, Java World!");
		System.out.println("Hello, Java World!");

		// 변수 선언
		int b;

		// 변수에 값의 할당
		b = 2;

		// 변수에 선언과 할당
		int a = 1;
		// int a; //같은 이름의 변수를 사용 시 에러 - Duplicate local variable a

		// int d = 3.14; // 타입에 맞지 않는 값 할당 시 에러 - Type mismatch: cannot convert from
		// double to int
		double c = 3.14;
		double f = 1;

		/*byte, short, int, long, float, double*/
		byte byteNumber = 1;
		byteNumber = 2;
		System.out.println(byteNumber);
		
		short shortNumber = 10;
		shortNumber = 11;
		System.out.println(shortNumber);
		
		int intNumber = 20;
		intNumber = 21;
		System.out.println(intNumber);
		
		long longNumber = 30L; //L - 리터럴이라고 부르고 자바에서 정수의 기본타입이 int라 데이터 타입을 표현하는 방법을 명확하게 하기 위해서 사용함
		longNumber = 31L;
		System.out.println(longNumber);
		
		longNumber = 30_000_000_000L; // java 1.7 이상부터 _ 로 숫자 구분자로 _ 가능
		
		float floatNumber = 3.3358F;
		System.out.println(floatNumber);
		
		double doubleNumber = 3.3358;
		System.out.println(doubleNumber);
		
		/*char*/
		char letter = 'A';
		letter = 97;
		System.out.println(letter);
		//System.out.println(letter+'1'); //char의 속성 상 문자이지만 아스키코드, 유니코드로 표현가능 java에서는 char를 유니코드로 저장
		letter = 'B';
		System.out.println(letter);
		letter = '1';
		System.out.println(letter);
		
		/*boolean*/
		boolean areYouStudent = true;
		System.out.println(areYouStudent);
		boolean areYouDesigner = false;
		System.out.println(areYouDesigner);
		
		/*상수*/
		final int SPEED_OF_LIGHT = 299_792_458;
		System.out.println(SPEED_OF_LIGHT);
		
		//System.out.println(Math.PI);
		//System.out.println(Math.E);
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		
		//speedOfLight = 10; //The final local variable speedOfLight cannot be assigned. It must be blank and not using a compound assignment
		
		/*형변환*/
		long bigNumber = Integer.MAX_VALUE + 1L;
		int normalNumber = (int)bigNumber; //명시적 형변환을 잘못할 경우 오버플러우 에러 발생할 수 있다.
		System.out.println(bigNumber);
		System.out.println(normalNumber);
		
		//int num = 10;
		//float fnum = num;
		//double dnum = num;
		//		
		//System.out.println(num);
		//System.out.println(fnum);
		//System.out.println(dnum);
		
		float fnum = 10.9f;
		int num = (int) fnum;
		System.out.println(fnum);
		System.out.println(num);
		
//		double dnum = 11.15;
//		num = (int) dnum;
//		System.out.println(dnum);
//		System.out.println(num);
		
		double dnum = 29.37;
		double dnum2 = dnum * 10;
		System.out.println(dnum2);
		
		dnum2 = Math.round(dnum2);
		System.out.println(dnum2);
		
		double dnum3 = dnum2 / 10;
		System.out.println(dnum3);
		
		int number = 10;
		int addedNumber = number + 2;
		System.out.println(addedNumber);
		
		int subtractedNumber = num - 3;
		System.out.println(subtractedNumber);
		
		int multipleNumber = num * 3;
		System.out.println(multipleNumber);
		
		int devidedNumber = number / 3;
		System.out.println(devidedNumber);
		
		double doubleNum = 10;
		double devidedNumber2 = doubleNum / 3;
		System.out.println(devidedNumber2);
		
		int devideRemainNumber = number % 3;
		System.out.println(devidedNumber);
		
		int bcd =1;
		bcd += 2;
		System.out.println(bcd);
		
		
	}
}