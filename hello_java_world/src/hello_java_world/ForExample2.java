package hello_java_world;

public class ForExample2 {
	public static void main(String[] args) {
		// for 반복문 연습문제
		// 1. 1부터 100까지의 합을 구해 출력하세요.
		int result = 0;
		for (int i = 1; i < 101; i++) {
			result += i;
		}
		System.out.println(result);

		// 2. 1부터 100 중 홀수의 합을 구해 출력해보세요.
		int result2 = 0;
//		for (int i = 1; i < 101; i = i + 2) {
//			result2 += i;
//		}

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				result2 += i;
			}
		}

		System.out.println(result2);

		// 3. 1 부터 100중 3,5,6의 배수만 출력해보세요.
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}

		// 4. 아래 결과가 나오게 반복문을 작성해보세요.
		// i * j 행렬
		// i 갯수만큼 *
		// j 갯수만큼 " "
		for (int i = 1; i < 6; i++) {
			for (int j = 1; i >= j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
