class fun {
    private static int j;

    public static void generateRandomArray(){
        long x = System.currentTimeMillis();
        long n = 1000000;
        long arr[];
        for(int i=0;i<n;i++){
            arr[i] = System.currentTimeMillis() % 100000000;
        }
        System.out.println(countPrime(arr, n));
    }

    public static boolean is7Digit(int number) {

        int count = 0;
        while (arr[i] > 0) {
            arr[i] = arr[i] / 10;
            count++;
        }
    }

    public static int countPrime(int arr[], int n) {
        int pCount=0;
        int nonPrime=0;
        for (int i = 0; i < n; i++) {
            if (is7Digit(arr[i])) {
                if (arr[i] % 2 == 0 || arr[i] % 3 == 0 || arr[i] % 4 == 0 || arr[i] % 5 == 0 || arr[i] % 6 == 0
                        || arr[i] % 7 == 0 || arr[i] % 8 == 0 || arr[i] % 9 == 0) {
                            pCount++;
                }
                else{
                    nonPrime++;
                }
            }
        }
        return pCount;
    }

    public static void main(String args[]) {
        generateRandomArray();
    }
}
