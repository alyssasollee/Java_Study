package study;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ĺ��� - Ŭ������, ������, �޼����, ��Ű���̸�

		int a1 = 10;
		int a_1 = 10;
		int $1 = 10;
		int _1 = 10;
		int fatherAge = 50;
		int fatherage = 50;
		//���ڷ� �����ϸ� �ȵ�
		//int 1a = 10;
		
		//Ư�����ڴ� ���Ұ�(���� $,_)
		//int a# = 20;
		
		//������ ������� ����
		//int father Age = 10;
		
		//������ ����� �� ����
		//int break = 10;
		
		//10���� ǥ����
		byte b1 = 10;
		
		//8���� ǥ����
		byte b2 = 012;
		
		//2���� ǥ����
		byte b3 = 0b1010;
		
		//16���� ǥ���� (0~f)
		short b4 = 0x12a2;
		
		int a2 = 100; //*�ڵ� ĳ���õȰ�. 
		long l0 = 100l; //*auto casting(x) 8byte�ڸ��� 1byte�� ������ ��. 
		long l1 = 2100_000_000; //*auto casting => int
		long l2 = 2200_000_000l; //*21�� �Ѿ �ڿ� l�ٿ������.
		
		float f1 = 12.45f;
		
		double d1 = 12.45; //d�� ��������.
		
		boolean isSuccess = false;
		
		//����ǥ����
		char c1 = 'a';
		
		//�ƽ�Ű�ڵ� 
		char c2 = 65; // 'a'���
		
		//�����ڵ� ǥ����
		char c3 = '\uc131';// '��'���� ���
		
		char c4 = '\''; //* => '���
		char c5 = '\\'; //* => \���
		char c6 = '"';//* => "��� (�׳� '\"')�ص� ������.
				
		System.out.println("aaa"+'\n'+"bbbbb");
		
		//casting ���� ��� circuit �߻� (�ڷ����� Ű���� int,long����)
		byte e1 = (byte)129; // -128 ~ 127
		
		System.out.println(e1); //8'-127' ��� 
		
		//casting ���� ��� cut �߻� (�ǵ������� ���� ���� �Ҽ��� ����)
		int e2 = (int)1234.56;
		
		System.out.println(e2); //*'1234' ���
		
		int e3 = 10;
		System.out.println(e3);
		int e4 = e3++; //���� �� ����
		System.out.println(e4); //10 e4=e3
		System.out.println(e3); //11 e3=10+1
		
		/* ���� �� ����
		int e5 = ++e3;//���� �� ����
		System.out.println(e5); //12 
		System.out.println(e4); //10
		System.out.println(e3); //12
		*/ 
		
		int e5 =10;
		double e6 = 10.0;
		System.out.println(e5==e6);
		
		// a && b => a�� false �϶� short circuit �߻�. (b�� ���� �ʾƵ� false)
		
		// a || b => a�� true �϶� short circuit �߻�. (�� �� �ϳ��� true����)
		
		System.out.println(1+2+3+"abcd");//primitive�̰� �����̸� +�� ���� => 6abcd
		
		System.out.println("abcd"+1+2+3);// abcd123
		System.out.println("abcd"+(1+2+3)); // abcd6
	}

}
