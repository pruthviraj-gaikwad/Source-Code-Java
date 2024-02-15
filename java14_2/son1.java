class college{
	college(){
		System.out.println("construction of college");
	}
}
class SGGS extends college{
	SGGS(){
		System.out.println("construction of SGGS");
	}
	SGGS(int x){
		System.out.println("para constructor");
	}
	
	public static void main(String args[]){
		SGGS sggs = new SGGS();
		//SGGS pg = new SGGS(6);
	}
}
