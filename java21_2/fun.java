class f {
    static{
        System.out.println("static block of fun");
    }
}

class pruthvi {
    static int y = 89;
    static pruthvi s = new pruthvi();
    static f q = new f();

    // pruthvi() {
    // System.out.println("hello constructor");
    // }

    static {
        if (y > 50)
            y = 39;
        System.out.println("hello static block");
    }

    public static void main(String[] args) {
        System.out.println(y);
    }
}
