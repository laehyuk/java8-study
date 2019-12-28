package impl;

public interface MyClassImpl {

    String NAME = "jlh";
    static final String BY = "by";

    public void run();
    public abstract void runAbstract();

    public default void runDefault( String name ){
        System.out.println("This is default method." + name);
    };


}
