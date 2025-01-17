import java.util.Scanner;

public class Game {
	public static void startGame() {
		// ctrl + shift + o
		// 키보드의 입력을 변수로 받아올 수 있도록 도와주는 코드
		Scanner keyboard = new Scanner(System.in);

		// 난수 생성
		double randomNumber = Math.random();

		// 난수를 0 ~ 99 정수로 전환
		int answer = (int) (randomNumber * 100);
		// 사용자가 입력하는 값을 할당할 변수를 선언
		int value = 0;

		while (true) {
			System.out.println("숫자를 입력하세요.");
			// 사용자가 keyboard 변수를 이용해 숫자를 입력한 후 엔터를 입력하면 value 변수에 값이 할당된다.
			value = keyboard.nextInt();

			// 컴퓨터가 만든 난수와 사용자가 입력한 숫자를 비교하여 일치한다면 "정답"을 출력한다.
			if (value > answer) {
				System.out.println("Down!");
				// 컴퓨터가 만든 난수와 사용자가 입력한 숫자를 비교했을 때 값이 더 작다면 "Up" 컴퓨터가 만든 변수가
			} else if (value < answer) {
				System.out.println("Up!");
			} else {
				System.out.println("정답");
				break;
			}
		}
	}

	public static void main(String[] args) {
		startGame();
		startGame();
		startGame();
		startGame();
	}
}
