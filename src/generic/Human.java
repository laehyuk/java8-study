package generic;

public class Human {

    private String name;

    Human (final String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name : " + name);
    }

}
