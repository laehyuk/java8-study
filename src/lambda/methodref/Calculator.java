package lambda.methodref;

public class Calculator {

    public static int staticMethod(int x, int y){
        return x+y;
    }

    public static int staticMethod(int y){
        return y;
    }

    public int instanceMethod(int x,int y){
        return x+y;
    }
}
