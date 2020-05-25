package study;

import java.util.ArrayList;

public class Java4 {
	private String name;
	private double height;
	
	//name�� ���� setter
	public void setName(String name) {
		this.name = name;
	}
	
	//name�� ���� getter
	public String getName() {
		return name;
	}
	
	//height�� ���� setter
	public void setHeight(double height) {
		this.height = height;
	}
	
	//height�� ���� getter
	public double getHeight() {
		return height;
	}
	
	//*�Ű������� 2�� �ִ� ������
	Java4(String name, double height){
		this.name = name;
		this.height = height;
	}

	//*�Ű������� ���� ������
	Java4(){
	}
	
	//*�Ű������� 1�� �ִ� ������
	Java4(String name){
		this.name = name;
	}
	
	public int plus(int first, int second) {
		return first + second;
	}
	
	
	public void print() {
		System.out.println(name + "," + height);
	}
	
	public ArrayList<Customer> list(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("�̼�1"));
		//customer c1 = new Customer("�̼�1));
		//list.add(c1); - ���� Ǯ���! c1�� �� ���� �����Ÿ� ��(���۷���������)�� �ٷ� �־����~ 
		list.add(new Customer("�̼�2"));
		list.add(new Customer("�̼�3"));
		list.add(new Customer("�̼�4"));
		
		return list;
	}
	
	public static void main(String[] args) {
		Java4 j = new Java4();
		ArrayList<Customer> list = j.list();
		
		for(Customer cust : list) {
			System.out.println(cust.name);
		}
		
	
			Java4 j1 = new Java4("a1", 170.2);
		//j1.name = "a1";
		//j1.height = 170.2;
		j1.print(); //*�ż���ȣ��
		int result1 = j1.plus(100, 2000); //*��ȯ��ȣ��
		System.out.println(j1.name);
		System.out.println(j1.height);
		
		Java4 j2 = new Java4();
		//j2.name = "a2";
		//j2.height = 180.3;
		j2.setName("a2");
		j2.setHeight(180.3);
		j2.print();
		int result2 = j2.plus(10,20);
				
		System.out.println(result2);
		System.out.println(j2.getName());//encapsulation �ȿ� ���ܼ� set/get���� �̿�!
		System.out.println(j2.getHeight());
		
		Java4 j3 = new Java4("a3");
		//j3.name = "a3";
		j3.height = 150.4;
		j3.print();
		
		System.out.println(j3.name);
		System.out.println(j3.height);
		
		Java4 j4 = j1;
		
		//Java4 j5 = new Java4 ���޴�,, �� ��ư �ؿ��� �� �־ ���� �� ! 
		
		System.out.println("==========���Ʒ� ����=======");
		System.out.println(new Java4("a4",190.1).getHeight());
		
		
	
	}


}
