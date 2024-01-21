class first {
    static float addtion(float x, float y) {
        return x + y;
    }

    static float sub(float x, float y) {
        return x - y;
    }

    static float mul(float x, float y) {
        return x * y;
    }

    static float div(float x, float y) {
        if (y == 0)
            return -1;
        else
            return x / y;
    }

    static float mod(float x, float y) {
        if (y == 0)
            return -1;
        else
            return x % y;
    }

    static int power(int x, int y) {
        int a = 1;
        if (y == 0)
            return -1;
        else {
            while (y != 0) {
                a = a * x;
                y--;
            }
            return a;
        }
    }

    static int squareroot(int x) {
        int i = 0;
        for (i = 0; i <= x / 2; i++) {
            if ((i * i) == x)
                break;
        }
        return i;
    }

    static int cuberoot(int x) {
        int i = 0;
        for (i = 0; i < x / 2; i++) {
            if((i*i*i)==x)
            break;
        }
        if(i>0)
        return i;
        else return -1;
    }

    public static void main(String[] args) {
        // addtion of two number
        float u = addtion(7f, 8f);
        System.out.print("sum of two number:");
        System.out.println(u);
        float a = addtion(7.7f, 7f);
        System.out.print("sum of two number:");
        System.out.println(a);

        // sub of two number
        float b = sub(9, 7);
        System.out.print("subraction of two number is :");
        System.out.println(b);
        float c = sub(9.9f, 8);
        System.out.print("subraction of two number is :");
        System.out.println(c);

        // multiplication
        float d = mul(4, 7);
        System.out.print("multiplication of two number is:");
        System.out.println(d);

        // division
        float e = div(3, 2);
        System.out.print("division of two number is: ");
        System.out.println(e);

        // modulus
        float f = mod(2, 10);
        System.out.print("modulus of two number is:");
        System.out.println(f);

        // power
        int g = power(3, 2);
        System.out.printf("%d ^ %d is %d:\n", 3, 2, g);

        // squareroot
        int h = squareroot(4);
        System.out.printf("squareroot of %d is %d\n", 4, h);

        // cuberoot
        int i = cuberoot(64);
        System.out.printf("cuberoot of %d is %d\n", 64, i);
        

    }
}