package impl;

public class MyClass implements MyClassImpl {

    public static void main( String[] args ) {
        MyClass mc = new MyClass();
        mc.myCustomMethod();
    }

    public void myCustomMethod(){
        runDefault(NAME);
    }

    @Override
    public void run() {
        System.out.println("This is basic method.");
    }

    @Override
    public void runAbstract() {
        System.out.println("This is abstract method.");
    }

}
