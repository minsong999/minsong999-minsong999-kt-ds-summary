package hello_java_world;

public class IfExam2 {
	public static void main(String[] args) {
		int money = 1_000_000;

		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultAge = 19;

		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		int totalFlightFare = 0;

		//int adultMemeber = 0;
		//int kidMemeber = 0;
		
		totalFlightFare += father >= adultAge ? adultOneWayFlightFare : kidOneWayFlightFare;
		totalFlightFare += mother >= adultAge ? adultOneWayFlightFare : kidOneWayFlightFare;
		totalFlightFare += daughter >= adultAge ? adultOneWayFlightFare : kidOneWayFlightFare;
		
		
		/*
		 * if (father >= adultAge) { totalFlightFare += adultOneWayFlightFare; //
		 * adultMemeber++; } else { totalFlightFare += kidOneWayFlightFare; //
		 * kidMemeber++; }
		 * 
		 * if (mother >= adultAge) { totalFlightFare += adultOneWayFlightFare; //
		 * adultMemeber++; } else { totalFlightFare += kidOneWayFlightFare; //
		 * kidMemeber++; }
		 * 
		 * if (daughter >= adultAge) { totalFlightFare += adultOneWayFlightFare; //
		 * adultMemeber++; } else { totalFlightFare += kidOneWayFlightFare; //
		 * kidMemeber++; }
		 */

		// totalFlightFare = adultMemeber * adultOneWayFlightFare + kidMemeber * kidOneWayFlightFare;
		System.out.println(totalFlightFare);
		 
		if (totalFlightFare <= money) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에가자ㅠㅠ");
		}

	}
}
