package chapter3;

class OopTest2 {
	
	int instanceInt;
	String instanceString;
	
	
	// 오버로딩
	// 같은 이름의 메서드를 여러 개 정의하는 것
	// 메서드의 이름이 같은 상태에서 매개변수의 타입, 갯수, 순서가 다르면 오버로딩 할 수 있음
	static OopTest2 createInstance() {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = 0;
		instance.instanceString = "default";
		return instance;
	}
	
	static OopTest2 createInstance(int argument1) {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = argument1;
		instance.instanceString = "default";
		return instance;
	}
	
	static OopTest2 createInstance(int argument1, String argument2) {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = argument1;
		instance.instanceString = argument2;
		return instance;
	}

	static OopTest2 createInstance(String argument2, int argument1) {
		OopTest2 instance = new OopTest2();
		instance.instanceInt = argument1;
		instance.instanceString = argument2;
		return instance;
	}
	
	// 반환 타입과 매개변수의 변수명은 오버로딩에 영향을 미치지 않음
//	void overloadMethod(int argument1, int argument2) {
//		
//	}
//	
//	int overloadMethod(int argument2, int argument1) {
//		return 0;
//	}
	
}

public class Oop2 {
	
	// 기본형 데이터타입의 매개변수를 받는 메서드
	// 기본형 데이터타입의 매개변수는 값을 직접 복사해서 받기 때문에
	// 호출부에서는 영향을 받지 않음
	static void basicParameterMethod(int argument) {
		argument = 99;
		System.out.println("in method : " + argument);
	}
	
	// 참조형 데이터타입의 매겨변수를 받는 메서드
	// 참조형 데이터타입의 매개변수는 값을 가지고 있는 '주소'를 복사해서 받기 때문에
	// 호출부에서 참조하는 인스턴스에도 영향을 미침
	static void refferencePramenterMethod(OopTest2 argument) {
		argument.instanceInt = 99;
		System.out.println("in method : " + argument.instanceInt);
	}
	
	// 기본형 데이터타입을 반환하는 메서드
	static int basicReturnMethod() {
		int number = 10;
		return number;
	}
	
	// 참조형 데이터타입을 반환하는 메서드
	static OopTest2 refferenceReturnMethod() {
		OopTest2 object = new OopTest2();
		object.instanceInt = 100;
		object.instanceString = "문장입니다.";
		return object;
	}

	public static void main(String[] args) {
		
		int number = 0;
		basicParameterMethod(number);
		System.out.println("out method : " + number);
		
		System.out.println("==================================================");
		
		OopTest2 object = new OopTest2();
		object.instanceInt = 10;
		object.instanceString = "문자열";
		refferencePramenterMethod(object);
		System.out.println("out method : " + object.instanceInt);
		
		System.out.println("==================================================");
		
		int resultNumber = basicReturnMethod();
		System.out.println("resultNumber : " + resultNumber);
		
		OopTest2 resultObject = refferenceReturnMethod();
		System.out.println("resultObject.instanceInt : " + resultObject.instanceInt);
	
		System.out.println("==================================================");
		
		OopTest2 object1 = new OopTest2();
		object1.instanceInt = 0;
		object1.instanceString = "문자열";
		System.out.println("object1.instanceInt : " + object1.instanceInt);
		
		OopTest2 object2 = OopTest2.createInstance(20, "열자문");
		System.out.println("object2.instanceInt : " + object2.instanceInt);
	}

}




