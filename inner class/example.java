class MyException extends Exception{
    @Override
    public String toString(){
        return "divide by zero exception";
    }
}

class example {
    public static void fun() throws MyException{
        if(true == true) throw new MyException();
    }

    public static void main(String... args) throws MatchException{
        try {
            fun();
        } catch (MyException e) {
            System.out.println(e);
        }        
    }
}
