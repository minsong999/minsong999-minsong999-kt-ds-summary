package oop_exam;

/**
 * 교재 171번 문제
 */
public class ReturnMethodQuiz5 {

	/**
	 * 성적 평균 점수을 통해 성적 평균 점수 단어 구하기
	 * 
	 * @param average 성적 평균
	 * @return averageString 성적 평균 점수 단어(A+,A,B+,B,C,F)
	 */
	public static String getAverageString(int average) {
		String averageString = "";
		if (average >= 95) {
			averageString = "A+";
		} else if (average >= 90) {
			averageString = "A";
		} else if (average >= 85) {
			averageString = "B+";
		} else if (average >= 80) {
			averageString = "B";
		} else if (average >= 70) {
			averageString = "C";
		} else {
			averageString = "F";
		}

		return averageString;
	}

	/**
	 * 합계 구하기
	 * 
	 * @param korScore  국어성적
	 * @param engScore  영어성적
	 * @param mathScore 수학성적
	 * @param progScore prog성적
	 * @return 합계
	 */
	public static int getSum(int korScore, int engScore, int mathScore, int progScore) {
		int sum = 0;
		sum = korScore + engScore + mathScore + progScore;
		return sum;
	}

	/**
	 * 평균 구하기
	 * 
	 * @param sum 성적 합계
	 * @param subjectCount 과목  수
	 * @return average 성적 평균
	 */
	public static int getAverage(int sum, int subjectCount) {
		int average = sum / subjectCount;
		return average;
	}

	public static void main(String[] args) {
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		int sum = 0;
		int average = 0;

		sum = getSum(korScore, engScore, mathScore, progScore);
		average = getAverage(sum, 4);
		String averString = getAverageString(average);

		System.out.println(averString);
		/*
		 * // 평균점수 95점 이상: A+     
		 * // 평균점수 90점 이상: A     
		 * // 평균점수 85점 이상: B+     
		 * // 평균점수 80점 이상: B     
		 * // 평균점수 70점 이상: C     
		 * // 평균점수 70점 미만: F
		 */
	}
}
