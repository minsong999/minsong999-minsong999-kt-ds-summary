package oop_exam;

public class HelloName {
	public static void helloName(String name, int ...age ) {
		System.out.println(name + age +  "씨, 안녕하세요.");
	}

	public static void main(String[] args) {
		helloName("스파크");
		helloName("헐크");
		helloName("그루트");
		
	}
}