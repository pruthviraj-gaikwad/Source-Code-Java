class Date_14_2 {
	public static void Rgenerator(int[] a, int size) {
		long n = 0l;

		for (int i = 0; i < size; i++) {
			n += System.currentTimeMillis();

			if (n % 9999999 < 1000000) {
				n = n + System.nanoTime() + 1233455;
			}

			a[i] = (int) Math.abs(n % 9999999);
		}
	}

	public static boolean isNPrime(int num) {
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static int countNPrime(int[] array, int length) {
		int noncount = 0;
		for (int i = 0; i < length; i++) {
			if (isNPrime(array[i])) {
				noncount++;
			}
		}
		return noncount;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrime(int[] array, int length) {
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (isPrime(array[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int a[] = new int[1000000];
		int i = 0;
		int j = 0;
		System.out.println("Approach 1" );
		while (i < 5){
			System.out.println("Approach 1 ->" + i );
			long t1 = System.nanoTime();
			Rgenerator(a, a.length);
			int x = countPrime(a, a.length);
			int x2 = 1000000 - x;
			System.out.println("Prime Numbers :" + x);
			System.out.println("Non Prime Numbers :" + x2);
			long t2 = System.nanoTime();
			long endt = t2 - t1;
			System.out.println("total time :" + endt + " nanoSeconds");
			System.out.println("###################################################");
			i++;
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(" ");
		System.out.println("Approach 2");
		while (j < 5) {
			System.out.println("Approach 2 ->" + j );
			long t3 = System.nanoTime();
			Rgenerator(a, a.length);
			int y = countNPrime(a, a.length);
			int y2 = 1000000 - y;
			System.out.println("Prime Numbers:" + y2);
			System.out.println("Non Prime Numbers :" + y);
			long t4 = System.nanoTime();
			long endt2 = t4 - t3;
			System.out.println("total time :" + endt2 + " nanoSeconds");
			System.out.println("###################################################");
			j++;
		}
	}

}