package chapter3;

// OOP : 객체지향 프로그래밍
// 프로그램을 객체들의 집합으로 보는 관점
// 객체지향 프로그래밍의 핵심 요소 : 클래스 + 객체

// class : 공통적인 성질을 가지고 있는 대상들을 정의한 것
//         객체를 생성하는 틀

// class 선언 방법 : 
// 접근제어자 class 클래스명 {
//   속성1;
//   속성2;
//   ...
//   기능1 {}
//   기능2 {}
//   ...
// }
class Monitor {
	// 가로 길이
	int width;
	// 세로 길이
	int height;
	// 프레임
	int frame;
	// 시리얼 번호
	String serailNumber;
	// 전원 상태
	boolean power;
	
	// 모니터 전원 키고 끄기
	void setPower() {
		power = !power;
	}
	// 현재 모니터의 가로 세로 길이를 출력해주는 기능
	void printSize() {
		System.out.println("width : " + width);
		System.out.println("height : " + height);
	}
}

// basicPacrice.CurrencyExchange02 의 화폐 단위와 환율에 대한 정보를
// 정의하는 클래스

// 사용자 지정 타입으로써의 클래스
class ExchangeRateInfomation {
	String monetaryUnit;
	double exchangeRate;
	// SRP 원칙 위배
//	String[] countryList;
//	int numberOfPeople;
}

// 메서드의 집합으로써의 클래스
class MathematicalFormula {
	
	// 현재 클래스는 수학 공식에 대한 책임만 지고 있는 클래스인데
	// 관련 없는 책임이 부여된 경우이다.
	// 이는 SRP 원칙에 위배됨
	void printData(String name, int age) {
		System.out.println("당신의 이름은 " + name + " 이고 나이는 " + age + "입니다.");
	}
	
	// 삼각형의 넓이
	double getWidthOfTriangle(int base, int height) {
		double widthOfTriangle = base * height * 0.5;
		return widthOfTriangle;
	}
	
	// 사각형의 넓이
	double getWidthOfRectangle(int base, int height) {
		double widthOfRectangle = base * height;
		return widthOfRectangle;
	}
	
	// 사다리꼴의 넓이
	double getWidthOfTrapezoid(int base, int upper, int height) {
		double widthOfTrapezoid = (base + upper) * 0.5 * height;
		return widthOfTrapezoid;
	}
}

public class Oop1 {

	public static void main(String[] args) {
		
		// 객체
		// 클래스에 의해서 생성되는 실체
		// 클래스에 정의된 구조에 따라서 메모리 공간이 지정된 것
		
		// 객체 생성 방법
		// 클래스명 참조변수명 = new 클래스명();
		Monitor monitor1 = new Monitor();
		System.out.println(monitor1);
		Monitor monitor2 = new Monitor();
		System.out.println(monitor2);
		
		// 객체의 속성에 접근하는 방법
		// 참조변수명.속성;
		System.out.println(monitor1.width);	
		System.out.println(monitor1.height);
		
		monitor1.width = 1920;
		monitor1.height = 1080;
		monitor1.frame = 60;
		monitor1.power = false;
		
		monitor2.width = 1600;
		monitor2.height = 900;
		monitor2.frame = 30;
		monitor2.power = false;
		
		System.out.println("monitor1");
		System.out.println("width: " + monitor1.width);
		System.out.println("height: " + monitor1.height);
		System.out.println("frame: " + monitor1.frame);
		System.out.println("power: " + monitor1.power);

		System.out.println("monitor2");
		System.out.println("width: " + monitor2.width);
		System.out.println("height: " + monitor2.height);
		System.out.println("frame: " + monitor2.frame);
		System.out.println("power: " + monitor2.power);
		
		// 객체의 메서드를 호출하는 방법
		// 참조변수.메서드명(파라미터);
		monitor1.setPower();
		
		System.out.println("monitor1");
		System.out.println("width: " + monitor1.width);
		System.out.println("height: " + monitor1.height);
		System.out.println("frame: " + monitor1.frame);
		System.out.println("power: " + monitor1.power);

		System.out.println("monitor2");
		System.out.println("width: " + monitor2.width);
		System.out.println("height: " + monitor2.height);
		System.out.println("frame: " + monitor2.frame);
		System.out.println("power: " + monitor2.power);
		
	}

}



