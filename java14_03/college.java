class father{
	String fatherName;
	//father(){
	//this("prem");
	//}
	father(String name){
		System.out.println("in father constructor:" +name);
	}
	
	father(int x){
		System.out.println("in father constructor:" + x);
	}
}
class college extends father{
	String collegeName;
	//this key word use for  local constructor invocation
	//college(String name){ //we done extend class bcz of in this  constructor first line invok father() and execute the college constructor if there is this(String) then it invok father(String)
		//System.out.println("in college constructor :"+name);
	//}
	
	college(int x){
		super(x);
		System.out.println("in college constructor :"+x);
	}
	
	public static void main(String args[]){
		//college sggs = new college("pruthvi");//it invok contructor
		college sggs1 = new college(5);
	}
}
	
