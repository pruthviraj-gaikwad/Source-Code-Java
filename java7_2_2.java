class grandfather{
	int balance=100;
	static String a ="pruthvi";
	String b="gaikwad";
	
	public int grandfather(int x){
		return 0;
	}
	public static void main(String args[]){
		//System.out.println(a);
		grandfather sun= new grandfather();
		//System.out.println(sun.fun(5L,7));
	      	//System.out.println(sun.fun(Integer.MAX_VALUE,5));
	      	//sun.n(5,6,5);
	      	//sun.grandfather(sun); 
	      	//System.out.println(sun);
	      	System.out.println(varargs(2,'g',5,6));
			System.out.println(sun.grandfather(0));
	}
	
	public static int varargs(int a,char c,int... b){
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		return 0;
	}
	
// 	public int fun(int a,int b){
// 		System.out.println(a +" " + b + " are long ,int");
// 		return 0;
	
// 	}
// 	public int fun(long a,long b){
// 		System.out.println(a + b +"are int,int");
// 		return 0;            
// 	}
	
// 	public int n(int a){
// 		return 0;
// 	}
	
// 	public Object grandfather(grandfather o){
// 		System.out.println(o);
// 		return o;
// 	}
}
