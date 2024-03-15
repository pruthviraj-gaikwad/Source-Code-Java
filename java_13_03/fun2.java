//class father{
//	static{
//		System.out.println("hello in same class father");
//	}
//}
public class father{ // it having public ->error father should declared	in same class name .java file
//	static{
//		System.out.println("hello in same class father");
//	}
}
//if class having public modifier then it class name is same as file name otherwise it give error like ->father class is public should be declared in a file named father.java
class fun2 extends father{

	static{
		System.out.println("hello fun static block");
	}
	
	//public String myToString(){
		//System.out.println("hello");
	//	return ""+getClass()+"@"+Integer.toHexString(hashCode());
	//}
	
	public static void main(String arg[]){
		fun2 a = new fun2();
		//System.out.println(a);
		//System.out.println(a.toString());
		//System.out.println(a.myToString());
	}
}
