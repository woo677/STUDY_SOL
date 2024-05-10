public class One {

	public static void main(String[] args) {
		
		// 단항 연산자 
		
		int x = 10;
		int y = 10;
		
//		++a 면 증가를 먼저하고 다음줄 실행
//		a++ 면 다 실행하고 나중에 증가
		
		x++; //나중에 증가
		++y; //먼저 증가
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x=1;
		y=1;
		int result1 = (++x)+10; // x 가 먼저 증가 -> 2, 10을 더하면 = 12
		int result2 = (y++)+10; // y와 10을 더해서 11, 이후 y는 1증가해서 2
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);

		// ++가 뒤에 붙는다. (아령들고 나서 1세기) -> 카운트에 주로 활용
		// ++가 앞에 붙는다. (증가한 내용을 이용해 다른행동을 할 때)
		

		//true, false 의 값을 반전 시킨다
		
		//반전 여산(! not)
		boolean yn = true;
		System.out.println("yn = "+yn);
		
		yn = !yn;
		System.out.println("!yn = "+yn);
		
		yn = !yn;
		System.out.println("!yn = "+yn);
		
	}

}
