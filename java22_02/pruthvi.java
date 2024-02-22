class sggs {
    static int x = 23;

    // static {
    // System.out.println("start with static block ");
    // }
    {
        System.out.println("init second block::" + this);
    }

    {
        System.out.println("init block ::" + this);
    }

    sggs() {
        System.out.println("In constructor block" + this);
        //  y = 20;
    }

    static public void main(String args[]) {
        sggs p = new sggs();
        System.out.println(p);
        // System.out.println("In main block");
        // p = new sggs();
        // System.out.println(p);
    }

    // static {
    // System.out.println("end with static block");
    // }
}
