class Super {
    int x;

    static class sub {
        void show() {
            System.out.println("hello in show()");
        }
    }
}

class pruthvi {
    int x = 20;

    class prem {
        void show() {
            System.out.println("hello in show()");
        }
    }
}

class InnerEx1 {
    public static void main(String... args) {
        System.out.println("hello");

        Super.sub r = new Super.sub();
        r.show();

        pruthvi.prem p = new pruthvi().new prem();
        p.show();

        // pruthvi x = new pruthvi();
        // System.out.println(x.x);
        // prem e = x.new prem();
    }
}