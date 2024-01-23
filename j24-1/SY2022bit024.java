class SY2022bit024{
	public static int task1(int arr[]){
	return arr[0];
	}

	public static int task2(int arr[]){
	return arr[arr.length-1];
	}

	public static int task3(int arr[]){
	return arr[arr.length-2];
	}

	public static int task4(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
		sum+=arr[i];
		}
	return sum;
	}

	public static void main(String args[]){
	int arr[]={1,2,3};

	System.out.print("first element:");
    	System.out.println(task1(arr));

	System.out.print("last element:");
        System.out.println(task2(arr));

	System.out.print("last second element:");
        System.out.println(task3(arr));

	System.out.print("sum of array element:");
        System.out.println(task4(arr));
	}
}
