class fun extends pruthvi {
    int x = 100;
    fun(){
        super();
    }
    fun(int x){
        super(90);
    }
    public final void show(int x) {
        this.x = x;
    }
}

class pruthvi {
    pruthvi() {
        System.out.println("hello");
    }
    pruthvi(int x){
        System.out.println("hello pruthvi");
    }
}

class ex {
    public static void main(String... args) {
        fun x1 = new fun(90);
        x1.show(90);
        System.out.println(x1.x);
    }
}
