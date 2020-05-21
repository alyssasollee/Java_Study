package study;

public class Java3 {
	public static void main(String[] args) {
		//1. 배열 선언과 생성
		int[] a = new int[4];
				 
		//2. 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		//3. 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		int a1 = a[1];
		int a2 = a[2];
		int sum = a[1] + a[2];
		//*int sum = a1 + a2 이거 보다 위에 바로 하는 게 더 좋음.
		
		System.out.println(sum);
	
		//출력 for loop
		for(int i=0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//출력 enhanced for loop
		
		for(int value : a) {
			System.out.println(value);
		
		}
		//1. 배열 선언, 생성, 할당
		String[] str = {"apple","banana","melon","blueberry"}; //{과일}앞에 "String[]" 안해도됌.
		
		//2. 출력 for loop
		for(int i=0; i<str.length;i++) {
			String value = str[i];
			System.out.println(value);
		}			
		
		//3. 출력 enhanced for loop
		for(String value : str) {
			System.out.println(value);
	
		}
		
		
		//*(몰라도 되는데 배열이름 설정하는 거!) 참조에 참조한거야 value값은 이상한데 value.name해야 이름이나와. 
		Customer[] cust = new Customer[2];
				
		cust[0] = new Customer("성영한");
		cust[1] = new Customer("손정의");
				
		for( Customer value : cust ) {
			System.out.println(value.name);
		}
		
		int[] array = new int[4];
		 array[0] = 100;
		 array[1] = 200;
		 array[2] = 300;
		 array[3] = 400;
		 
		 for(int i=0; i<array.length;i++) {
			 System.out.println(array[i]);
		 }
		 
		 
		 
		 
		 
		 
		 
		 for(int value : array) {
			 System.out.println(value);
		 }
		 
		 
		 
		 
		 int[] test = new int[3];
		 
		 test[0] = 1000;
		 test[1] = 2000;
		 test[2] = 3000;
		 
		 for(int i=0; i<test.length;i++) {
		 System.out.print(test[i]+"\t");
		 }
		 
		 System.out.println(); //대행
		 
		 
		 for(int v : test) {
			 System.out.println(v);
		 }
		 
		 //일차형배열까지만 해보자~ 이차형배열은 나중에,,,, 지겨워지면,,? 언젠가,,? 
		 
		 String[] subject = new String[3];
		 
		 subject[0] = "국어";
		 subject[1] = "영어";
		 subject[2] = "수학";
		 
		 for(int i=0; i<subject.length;i++) {
		 	 System.out.println(subject[i]);
		 }
		
		 for(String b : subject) {
			 System.out.println(b);
		 
		 
		 }
	
		
		
		
		
		
		
		
		
	}
}
