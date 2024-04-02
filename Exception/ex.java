class ex{
	public static void main(String args[]){
		//System.out.println("pruthvi");
		int[] a={1,2,3,4,5};
		try{
			System.out.println(a[10]);
		}
		catch(Exception error){
			System.out.println("array index out of bound");
		}
	}
}
