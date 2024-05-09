package Chapter01;

public class Casting {

	public static void main(String[] args) {
		
//		형변환(Casting)캐스팅
		
//		형변환은 묵시적 형변환, 명시적 형변환 이있다.
//		묵시적 형변환(Promotion) : 작은거에서 큰 걸로 이동 (암묵적으로 들어가도 된다)
//		명시적 형변환 : 큰거에서 작은걸로 이동 (내가 들어간다고 명시 해야된다)
//		ex : 컵에 있는 물을 옮긴다고 생각 하면됨
		
//		↓↓↓ 명시적 형변환 
		
		char charValue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;
		
		intValue = 74; // J
//		int -> char
		charValue =  (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		doubleValue = 3.14;
		
//		long -> int
		intValue = (int) longValue;
		
//		double -> float
		floatValue = (float) doubleValue;
		
		System.out.println(intValue);
		System.out.println(floatValue);

	}

}
