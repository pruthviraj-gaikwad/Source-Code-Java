class example{
	int x;
	example(int x){
		example.this.x=x;
	}
	public static void main(String ...args){
		try{
			System.exit(1);
			System.out.println(args[0]);
			example p = new example(50);
		
			p=new example(50);
			System.out.println(args[0]);
		}
		catch(Exception ex){
			System.out.println("array index out of bound exception"); 
		}
		finally{
			System.out.println("in finally block");
		}
		
	}
}
