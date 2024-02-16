public class fun2 {
    public static void main(String[] args) {
        long c = System.currentTimeMillis() % 9999999l;
        if (c < 1000000) {
            c += 1234567;
        }
        System.out.println(c);
        for(int i=0;i<5;i++){
            System.out.println("fuck you parand");
        }

    }
}
