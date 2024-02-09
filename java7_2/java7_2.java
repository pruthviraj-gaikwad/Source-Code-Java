class father{
	int b =100;
	static String m= "pruthvi";
	
	public static void main(String agrs[]){
		//System.out.println("hello");
		father o = new father();
		//System.out.println(o.fun(7));
		//System.out.println(fun(7));
		System.out.println(o.fun(29,34,60));
		//System.out.println(o);
		
		
	}
	
	//public static long fun(int x){
	//return x;
	//}
	public int fun(int... b){
     		//System.out.println(b);
     		//System.out.println(b[0]);
     		System.out.println(b[0] + " length :"+ b.length);
     		return 0;
	}
        
}
