package study;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 식별자 - 클래스명, 변수명, 메서드명, 패키지이름

		int a1 = 10;
		int a_1 = 10;
		int $1 = 10;
		int _1 = 10;
		int fatherAge = 50;
		int fatherage = 50;
		//숫자로 시작하면 안됨
		//int 1a = 10;
		
		//특수문자는 사용불가(예외 $,_)
		//int a# = 20;
		
		//공백을 허용하지 않음
		//int father Age = 10;
		
		//예약어는 사용할 수 없음
		//int break = 10;
		
		//10진수 표현법
		byte b1 = 10;
		
		//8진수 표현법
		byte b2 = 012;
		
		//2진수 표현법
		byte b3 = 0b1010;
		
		//16진수 표현법 (0~f)
		short b4 = 0x12a2;
		
		int a2 = 100; //*자동 캐스팅된거. 
		long l0 = 100l; //*auto casting(x) 8byte자리에 1byte만 차지한 것. 
		long l1 = 2100_000_000; //*auto casting => int
		long l2 = 2200_000_000l; //*21억 넘어서 뒤에 l붙여줘야함.
		
		float f1 = 12.45f;
		
		double d1 = 12.45; //d는 생략가능.
		
		boolean isSuccess = false;
		
		//문자표현법
		char c1 = 'a';
		
		//아스키코드 
		char c2 = 65; // 'a'출력
		
		//유니코드 표현법
		char c3 = '\uc131';// '성'으로 출력
		
		char c4 = '\''; //* => '출력
		char c5 = '\\'; //* => \출력
		char c6 = '"';//* => "출력 (그냥 '\"')해도 괜찮오.
				
		System.out.println("aaa"+'\n'+"bbbbb");
		
		//casting 했을 경우 circuit 발생 (자료형을 키우자 int,long으로)
		byte e1 = (byte)129; // -128 ~ 127
		
		System.out.println(e1); //8'-127' 출력 
		
		//casting 했을 경우 cut 발생 (의도적으로 쓸수 있음 소수점 버림)
		int e2 = (int)1234.56;
		
		System.out.println(e2); //*'1234' 출력
		
		int e3 = 10;
		System.out.println(e3);
		int e4 = e3++; //대입 후 증가
		System.out.println(e4); //10 e4=e3
		System.out.println(e3); //11 e3=10+1
		
		/* 내가 함 몰랑
		int e5 = ++e3;//증가 후 대입
		System.out.println(e5); //12 
		System.out.println(e4); //10
		System.out.println(e3); //12
		*/ 
		
		int e5 =10;
		double e6 = 10.0;
		System.out.println(e5==e6);
		
		// a && b => a가 false 일때 short circuit 발생. (b를 보지 않아도 false)
		
		// a || b => a가 true 일때 short circuit 발생. (둘 중 하나만 true여도)
		
		System.out.println(1+2+3+"abcd");//primitive이고 숫자이면 +는 연결 => 6abcd
		
		System.out.println("abcd"+1+2+3);// abcd123
		System.out.println("abcd"+(1+2+3)); // abcd6
	}

}
