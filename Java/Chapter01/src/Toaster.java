
public class Toaster {

	// 간단한 메서드 사용법
	
	public static void main(String[] args) {
		String dish = toaster("식빵"); //toaster("식빵") <- 얘가 메서드를 호출함, 매개변수 : 식빵
		System.out.println(dish);
	}
	
	static String toaster(String input) { //toaster에서 보낸 매개변수를 받는다
		System.out.println(input+" 이 구워지고 있다");
		return "구워진 "+input;
	}

}
