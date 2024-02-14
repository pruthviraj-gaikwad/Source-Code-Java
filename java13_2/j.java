class father{
	int balance=123;
	
	public father(int balance){
		this.balance= balance;
		System.out.println(balance);
	}
	
	public static void main(String args[]){
		father son = new father(1234);
		System.out.println(son.balance);
	}
}
