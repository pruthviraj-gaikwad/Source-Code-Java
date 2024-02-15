class father{
	public static String n ="pruthvi";
	int balance = 123;
	
	public father(float balance){
		if(balance + 0.2 == 3.2)
		{
			System.out.println(balance);
		}
		//System.out.println(balance);
		
	}
	
	public father(double balance){
		if(balance + 0.2 == 0.5){
			System.out.println(balance);
		}
	}
	
	public father(int balance){
		System.out.println(balance = 12345);
	}
	
	public static void main(String args[]){
	 	//System.out.println(n);
	 	//father son = new father(3.0f);
	 	//father son = new father(0.3d);
	 	father son = new father (3);
	}
}
