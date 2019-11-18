package lambda.basic;

public class MyFunctionalInterfaceExample2 {

    public static void main( String[] args ) {
        MyFunctionalInterface2 fi;

        fi = (x, y) -> {
            return x+y;
        };
        int result = fi.method(3,4);
        System.out.println(result);
    }
}
