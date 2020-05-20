package study;

public class Java2 {
	public static void main(String[] args) {
		String season = null;
		int month = 9;
		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if(month == 6 || month == 7 || month == 8 ) {
			season = "여름";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "겨울";
		}else {
			season = "없는 계절";
		}
		System.out.print(month+"월은 "+season+"입니다.\n");
		//%d => 정수형, %f => 실수형, %s => String, %n => 개행
		System.out.printf("%d월은 %s입니다.%n", month, season);
	
		//month => char, byte, short, int, String 가능 (외 안됌)
		switch(month) {
		case 12 :  //12,1,3,4,6,7,9,10 season값 생략가능
		case 1 : 
		case 2 : season="겨울"; break;
		case 3 : 
		case 4 : 
		case 5 : season="봄"; break;
		case 6 : 
		case 7 : 
		case 8 : season="여름"; break;
		case 9 : 
		case 10 : 
		case 11 : season="가을"; break;
		default : season="없는 계절";
		}
		
		System.out.printf("%d월은 %s입니다.%n", month,season);
	
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d입니다.%n", sum);
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
			}
		}
		
		
		/* 증가 조건 출력 루트반복
		 * i = 2, j = 1 => 2 * 1 = 2
		 *      , j = 2 => 2 * 2 = 4
		 *      ...
		 *      , j = 9 => 2 * 9 = 18
		 * i = 3, j = 1 => 3 * 1 = 3
		 * ...
		 * i = 9, j     
		 * 
		 * 
		 * 
		 * 
		 */
		//*잘 안씀. while 이렇게 밖에 줄줄..
		int i = 1;
		sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		
		}
		
		System.out.printf("1부터 10까지 합은 %d입니다.%n", sum);
		
		i = 2;
		//int j = 1;여기 있으면 안댐.
		while(i<=9) {
			int j = 1;// 66행에 있으면 중괄호 밖에 있어서 j값이 10으로 끝나서 2단까지밖에 안됌.
			while(j<=9) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
				j++;
			}
			i++;
		}
		
		
			
		
		
		
		
		
		
		
		
	}
}
