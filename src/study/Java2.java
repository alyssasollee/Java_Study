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
		case 11: season="����"; break;
		default : season="���� ����";
		}
		
		System.out.printf("%d���� %s�Դϴ�.%n", month,season);
	
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
