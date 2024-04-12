/**
 * InnerInterface
 */
class MyException extends Exception{
    public String toString(){
        return "hllo";
    }
}

interface voter{
    void fun() throws MyException;
}

class fun2 implements voter {
    public void fun() throws MyException{
        if(0==0){
            throw new MyException();
        }
    }
}

class fun3{
    public static void main(String[] args) throws MatchException{
        fun2 f =new fun2();
        try{
            f.fun();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
