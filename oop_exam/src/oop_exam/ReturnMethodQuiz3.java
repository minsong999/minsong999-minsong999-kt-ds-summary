package oop_exam;

/**
 * 교재 168번 문제
 */
public class ReturnMethodQuiz3 {
	
/*  섭씨온도를 나타내는 celsius 변수와
	화씨온도를 나타내는 fahrenheit 변수가 있습니다.
	celsius 변수에는 30 이 할당되어 있습니다.
	섭씨 30도를 화씨온도로 변경하면
	화씨 86도가 됩니다.
	섭씨온도를 화씨온도로 변경해 
	fahrenheit 변수에 할당하고 출력해보세요.
	변경공식: (섭씨 × 9/5) + 32 = 화씨
*/
	
	/**
	 * 섭씨온도를 화씨온도로 출력한다.
	 * @param celsius 섭씨온도
	 * @return fahrenheit 화씨온도(섭씨온도 * 9/5) + 32
	 */
	public static int getFahrenheitByCelsius(int celsius) {		
		int fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}
	
	public static void main(String[] args) {	
		int celsius = 30;
		int fahrenheit = 0;
		
		fahrenheit = getFahrenheitByCelsius(celsius);
		System.out.println(fahrenheit);
	}
}
