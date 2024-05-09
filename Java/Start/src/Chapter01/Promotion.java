package Chapter01;

public class Promotion {

	public static void main(String[] args) {
		
//		형변환
		
//		형변환은 묵시적 형변환, 명시적 형변환 이있다.
//		묵시적 형변환(Promotion) : 작은거에서 큰 걸로 이동 (암묵적으로 들어가도 된다)
//		명시적 형변환 : 큰거에서 작은걸로 이동 (내가 들어간다고 명시 해야된다)
//		ex : 컵에 있는 물을 옮긴다고 생각 하면됨
		
//		↓↓↓ 묵시적 형변환 

		byte byteValue;
		char charValue = 'a';
		int intValue = 0;
		long longValue;
		float floatValue;
		double doubleValue;
		
		//byte < int
		byteValue = 10;
		intValue = byteValue;
		System.out.println(intValue);
		
		//char < int
		intValue = charValue;
		System.out.println(intValue); // 97 -> ASCII CODE (각 문자의 번호가 공통 규격으로 정해져 있다.)
		
		//int < long
		longValue = intValue;
		System.out.println(longValue);
		
		//float < double
		floatValue = 0.1f;
		doubleValue = floatValue;
		System.out.println(doubleValue);
		
		
		
	}

}
