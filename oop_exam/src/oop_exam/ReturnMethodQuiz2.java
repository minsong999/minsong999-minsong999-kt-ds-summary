package oop_exam;

/**
 * 교재 167번 문제
 */
public class ReturnMethodQuiz2 {
	
	/*
	 * 산술 연산자를 이용해 
	 * minutes와 seconds의 값을 초로 변환해
	 * time 변수에 할당하고 출력해보세요.
	 */
	
	/**
	 * 분과 초를 받아 수행시간(초단위)로 변환시킨다.
	 * @param minutes 분
	 * @param seconds 초
	 * @return time 분과 초를 수행시간으로 변환한 결과(초)
	 */
	public static int getTime(int minutes, int seconds) {
		int time = (minutes * 60) + seconds; 
		return time;
	}
	
	public static void main(String[] args) {
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		time = getTime(minutes,seconds);

		System.out.println(time);
		
	}
}
