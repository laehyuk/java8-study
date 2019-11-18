package lambda.methodref;

import java.util.function.IntBinaryOperator;

//lambda example
public class MethodReferencesExample {
    public static void main( String[] args ) {
        IntBinaryOperator operator;

        operator = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println("result1 = " + operator.applyAsInt(1,2));

        operator = Calculator :: staticMethod;
        System.out.println("result2 = " + operator.applyAsInt(3,4));

        Calculator calculator = new Calculator();
        operator = (x,y) -> calculator.instanceMethod(x,y);
        System.out.println("result3 = " + operator.applyAsInt(5,6));

        operator = calculator :: instanceMethod;
        System.out.println("result4 = " + operator.applyAsInt(7,7));

    }
}
