package study;

public class Java2 {
	public static void main(String[] args) {
		String season = null;
		int month = 9;
		if(month == 12 || month == 1 || month == 2) {
			season = "�ܿ�";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "��";
		}else if(month == 6 || month == 7 || month == 8 ) {
			season = "����";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "�ܿ�";
		}else {
			season = "���� ����";
		}
		System.out.print(month+"���� "+season+"�Դϴ�.\n");
		//%d => ������, %f => �Ǽ���, %s => String, %n => ����
		System.out.printf("%d���� %s�Դϴ�.%n", month, season);
	
		//month => char, byte, short, int, String ���� (�� �ȉ�)
		switch(month) {
		case 12 :  //12,1,3,4,6,7,9,10 season�� ��������
		case 1 : 
		case 2 : season="�ܿ�"; break;
		case 3 : 
		case 4 : 
		case 5 : season="��"; break;
		case 6 : 
		case 7 : 
		case 8 : season="����"; break;
		case 9 : 
		case 10 : 
		case 11 : season="����"; break;
		default : season="���� ����";
		}
		
		System.out.printf("%d���� %s�Դϴ�.%n", month,season);
	
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.printf("1���� 10���� ¦���� ���� %d�Դϴ�.%n", sum);
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
			}
		}
		
		
		/* ���� ���� ��� ��Ʈ�ݺ�
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
		//*�� �Ⱦ�. while �̷��� �ۿ� ����..
		int i = 1;
		sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		
		}
		
		System.out.printf("1���� 10���� ���� %d�Դϴ�.%n", sum);
		
		i = 2;
		//int j = 1;���� ������ �ȴ�.
		while(i<=9) {
			int j = 1;// 66�࿡ ������ �߰�ȣ �ۿ� �־ j���� 10���� ������ 2�ܱ����ۿ� �ȉ�.
			while(j<=9) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
				j++;
			}
			i++;
		}
		
		
			
		
		
		
		
		
		
		
		
	}
}
