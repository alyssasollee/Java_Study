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
		case 11: season="가을"; break;
		default : season="없는 계절";
		}
		
		System.out.printf("%d월은 %s입니다.%n", month,season);
	
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
