package study;

import java.util.ArrayList;

public class Java4 {
	private String name;
	private double height;
	
	//name에 대한 setter
	public void setName(String name) {
		this.name = name;
	}
	
	//name에 대한 getter
	public String getName() {
		return name;
	}
	
	//height에 대한 setter
	public void setHeight(double height) {
		this.height = height;
	}
	
	//height에 대한 getter
	public double getHeight() {
		return height;
	}
	
	//*매개변수가 2개 있는 생성자
	Java4(String name, double height){
		this.name = name;
		this.height = height;
	}

	//*매개변수가 없는 생성자
	Java4(){
	}
	
	//*매개변수가 1개 있는 생성자
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
		list.add(new Customer("이솔1"));
		//customer c1 = new Customer("이솔1));
		//list.add(c1); - 두줄 풀어쓴거! c1은 또 쓰지 않을거면 안(레퍼런스값으로)에 바로 넣어버려~ 
		list.add(new Customer("이솔2"));
		list.add(new Customer("이솔3"));
		list.add(new Customer("이솔4"));
		
		return list;
	}
	
	public static void main(String[] args) {
		Java4 j = new Java4();
		ArrayList<Customer> list = j.list();
		
		for(Customer cust : list) { //enhanced for loop문 이야!! 
			System.out.println(cust.name);
		}
		
	
			Java4 j1 = new Java4("a1", 170.2);
		//j1.name = "a1";
		//j1.height = 170.2;
		j1.print(); //*매서드호출
		int result1 = j1.plus(100, 2000); //*반환값호출
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
		System.out.println(j2.getName());//encapsulation 안에 숨겨서 set/get으로 이용!
		System.out.println(j2.getHeight());
		
		Java4 j3 = new Java4("a3");
		//j3.name = "a3";
		j3.height = 150.4;
		j3.print();
		
		System.out.println(j3.name);
		System.out.println(j3.height);
		
		Java4 j4 = j1;
		
		//Java4 j5 = new Java4 못햇당,, ㅎ 여튼 밑에는 다 넣어서 만든 거 ! 
		
		System.out.println("==========위아래 같음=======");
		System.out.println(new Java4("a4",190.1).getHeight());
		
		
	
	}


}
