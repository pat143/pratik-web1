class test1{
	int t1;
	Pk_test01 t;
	test1(int t1){
		this.t1=t1;		
	}
	void abc(){
		t=new Pk_test01();
		System.out.println("test1");
		t.pqr(3, 5);
	}
}

class Pk_test01 {
	test1 t11;
	//t11=t11.t1;
	 //int a=t11.t1;
	 //t11=new test1(a);
	
	void pqr(int i,int j){
		//j=5;
		t11=new test1(4);
		System.out.println(t11);
		int b=i*j;
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		//int a =4;
	 test1 t11=new test1(5);
		//Pk_test01 pk=new Pk_test01();
		t11.abc();
	
	}
}
