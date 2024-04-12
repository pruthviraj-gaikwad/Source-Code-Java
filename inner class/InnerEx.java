class InnerEx{
	int x=10;
	
	class fun{
		int x;
		public void show(){
			System.out.println("hello");
			this.x=50;
		}
	}
	public static void main(String ...args){
		InnerEx x = new InnerEx();
		System.out.println(x.x);
		fun r=x.new fun();
		r.show();
		System.out.println(r.x);
		InnerEx.fun r1 = new InnerEx().new fun();
		r1.show();
	}
}
