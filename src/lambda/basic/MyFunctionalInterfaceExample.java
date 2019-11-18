package lambda.basic;

public class MyFunctionalInterfaceExample {
    public static void main( String[] args ) {
        MyFunctionalInterface fi;
        String msg = "FunctionalInterface method call";
        String msg2 = "FunctionalInterface method call2";
        String msg3 = "FunctionalInterface method call3";

        fi = (output) -> {
            System.out.println(output);
        };
        fi.method(msg);

        fi = output -> {
            System.out.println(output);
        };
        fi.method(msg2);

        fi = output -> System.out.println(output);
        fi.method(msg3);
    }
}
