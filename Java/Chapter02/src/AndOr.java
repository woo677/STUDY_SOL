
public class AndOr {

	public static void main(String[] args) {
		
		// 조건식 AND, OR
		
		int val = 6;
		
//		&& = AND : 둘의 조건이 모두 만족해야 한다.
		if (val>1 && val <7) {
			System.out.println(val+" 은 1보다 크고 7보다 작군요");
		}
		
//		|| = OR : 둘의 조건중 하나만 만족해도 된다
		if (val%2==0 || val%3==0) {
			System.out.println("2 또는 3의 배수");
		}
		

	}

}
