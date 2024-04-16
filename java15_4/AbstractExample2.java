abstract class A{
	public A(){
		//System.out.println("hello in a");
	}
	public void math1(){
		System.out.println("hello in math1:A");
	}
	abstract public void math2();
	abstract public void math3();
}
class b extends A{
	public void math2(){
		System.out.println("hello in math2:b");
	}
	public void math3(){
		System.out.println("hello in math3:b");
	}
}
class c extends A{
	public void math2(){
		System.out.println("hello in math2:c");
	}
	public void math3(){
		System.out.println("hello in math3:c");
	}
}
class AbstractExample2{
	public static void main(String args[]){
		//b pruthvi =new b();
		//pruthvi.math1();
		//pruthvi.math2();
		//A prem = new b();
		//prem.math1();
		//prem.math2();
		//A arohi = new c();
		//arohi.math3();
		//arohi.math2();
	}
}
