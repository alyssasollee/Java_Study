package study;

public class Java3 {
	public static void main(String[] args) {
		//1. �迭 ����� ����
		int[] a = new int[4];
				 
		//2. �Ҵ�
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		//3. ���
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		int a1 = a[1];
		int a2 = a[2];
		int sum = a[1] + a[2];
		//*int sum = a1 + a2 �̰� ���� ���� �ٷ� �ϴ� �� �� ����.
		
		System.out.println(sum);
	
		//��� for loop
		for(int i=0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//��� enhanced for loop
		
		for(int value : a) {
			System.out.println(value);
		
		}
		//1. �迭 ����, ����, �Ҵ�
		String[] str = {"apple","banana","melon","blueberry"}; //{����}�տ� "String[]" ���ص���.
		
		//2. ��� for loop
		for(int i=0; i<str.length;i++) {
			String value = str[i];
			System.out.println(value);
		}			
		
		//3. ��� enhanced for loop
		for(String value : str) {
			System.out.println(value);
	
		}
		
		
		//*(���� �Ǵµ� �迭�̸� �����ϴ� ��!) ������ �����Ѱž� value���� �̻��ѵ� value.name�ؾ� �̸��̳���. 
		Customer[] cust = new Customer[2];
				
		cust[0] = new Customer("������");
		cust[1] = new Customer("������");
				
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
		 
				
		
		
		
		
		
		
		
		
		
	}
}
