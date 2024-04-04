interface sub{
	void math1();
	void math2();
}

class son implements sub{
	public void math1(){
		System.out.println("hello in son math1()");
	}
	public void math2(){
		System.out.println("hello in son math2()");
	}
	void math3(){
		System.out.println("hello in son math3()");
	}
}
class Interfaces{
	public static void main(String ...args){
		son text = new son();
		text.math1();
		text.math2();
		text.math3();
		
	}
}
