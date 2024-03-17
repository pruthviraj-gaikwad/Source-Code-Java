public class fun{
	String funName;
	
	fun(String name){
		this.funName = name;
		System.out.println(name + " " + this.funName);
	}
	
	public String getFunName(String name){
		this.funName = name;
		return funName +" class funName : "+ this.funName;
	}
	
	class me{
		String meName;
		
		me(String name){
			this.meName = name;
			System.out.println(name + " " + this.meName);
		}
		
		public String getNames(String name){
			return name + "\nclass funName:"+ fun.this.funName + "\nclass me:" + this.meName;
		}
	}
	
	public static void main(String args[]){
		fun sggs = new fun("fun pruthvi");
		System.out.println(sggs.getFunName("Fun s"));
		me sggs1 = sggs.new me("me prem");
		System.out.println(sggs1.getNames("Me p"));
		sggs= new fun("\n"+"pruthvi");
		
	}
}

