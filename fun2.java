class father{
	int balance ;
	static int p = 10;
	static String y="pruthvi";
	
	public static void main(String agrs[]){
		//System.out.println(p);	
		father sun = new father();
		System.out.println(sun.balance);
		//System.out.println(y);
		//sun.y = "prem";
		//System.out.println(sun.y);
		//System.out.println(y);
		//sun.value();
		sun.value(5,6);
		System.out.println(p);
	}	
	
	public int value(int a,int b){
		//System.out.println(y);
		System.out.println(balance);
		System.out.println(p);
		System.out.println(y);
		return 0;
	}
	
	public long value(int a,int c,int b){
		return 0;
		
	}

}
