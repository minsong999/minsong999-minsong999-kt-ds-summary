package hello_java_world;

public class OperatorExam {
	public static void main(String[] args) {
		int a = 10;
		int b = 345795;
		int c = -34595;
		int d = 35;
		int son = 7;
		int parent = 49;
		int e = 35;

//		  변수 a의 값이 10보다 크고 20보다 작은가?
//		  변수 b는 짝수인가?
//		  변수 c는 0보다 큰 짝수인가?
//		  변수 d의 값은 2 또는 5의 배수인가?
//		  son은 부모님과 함께 12세 이상 관람과의 영화를 볼수 있나?
//		  변수 e의 값은 3의 배수가 아닌가?

		System.out.println(a > 10 && a < 20);
		System.out.println(b % 2 == 0);
		System.out.println(c > 0 && c % 2 == 0);
		System.out.println(d % 2 == 0 || d % 5 == 0);
		System.out.println(son >= 12 && parent >= 12);
		System.out.println(e % 3 != 0);
		System.out.println(!(e % 3 == 0));

		int number = 7;

		if (number == 5) {
			System.out.println("숫자가 5와 같습니다.");
		} else {
			System.out.println("숫자가 5가 아닙니다.");
		}

		if (number == 5) {
			int number2 = 1;
			System.out.println(number);
			System.out.println(number2);
		} else {
			int number2 = 2;
			System.out.println(number);
			System.out.println(number2);
		}

		System.out.println(number);
//				System.out.println(number2);

		number = 7;
		if (number == 5) {
			System.out.println("숫자가 5와 같습니다.");
		} else if (number == 7) {
			System.out.println("숫자가 7과 같습니다.");
		} else {
			System.out.println("숫자가 5,7 아닙니다.");
		}

		double randomNumber = Math.random();
		int answer = (int) (randomNumber * 100);

		int value = 60;
		if (answer == value) {
			System.out.println("정답입니다.");
		} else if (answer > value) {
			System.out.println("UP");
		} else if (answer < value) { 
			System.out.println("Down");
		}

		System.out.println("정답은" + answer + "입니다.");

	}
}
