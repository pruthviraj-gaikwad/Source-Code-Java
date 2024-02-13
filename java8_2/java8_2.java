class pruthvi{

	int balance=100;
	static int p = 5;
	static String a ="prem";
	public pruthvi(){
		this(3);
		System.out.println("calling constructor");
	}
	
	public pruthvi(int x){
		System.out.println("calling prameterised constructor");
	}
	
	//public int pruthvi(int x){
	//	System.out.println("calling class as function");
	//	return 0;
	//}
	
	static class prem{
		
		public int fun(){
			return 1;
		}
		
	}
	
	public static void main(String args[]){
		pruthvi son = new pruthvi();
		//son.pruthvi(5);
		//pruthvi dougther = new pruthvi(4,5);
		//prem anotherClassInParentClass = new prem();
		//System.out.println(anotherClassInParentClass.fun()); 
		
	}
	
	
}


