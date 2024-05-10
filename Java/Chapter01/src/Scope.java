// 변수를 사용 할 수 있는 영역

public class Scope { //class
	
	String str = "some text";  //class 안에서 사용 사능

	public static void main(String[] args) { //method, function
		
		int num = 123; //method 안에서 사용 가능
		
		for (int i = 0; i < 5; i++) { // 문장(statement)
			int sum = num +1; // statement 안에서만 사용 가능
			System.out.println(sum);
		}
		
//		System.out.println(sum); //sum은 for 문장을 넘거갈 수 없다
		

	}

}
