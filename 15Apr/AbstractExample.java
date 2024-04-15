abstract class Super{
	public Super(){
		System.out.println("hello super class");
	}
	public void math1(){
		System.out.println("hello math1");
	}
	abstract public void math2();
}
class second extends Super{
	public void math2(){
		System.out.println("hello math2");
	}
}
public class AbstractExample{
	public static void main(String args[]){
		Super s = new second();
		s.math1();
		s.math2();
	}
}

