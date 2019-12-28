package optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.*;

public class Animal {

    private String name;
    private String type;
    private int age;
    private List<String> accessories;

    protected Animal() {
    }

    public Animal( String name, String type, int age ) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Animal( String name, String type, int age, List<String> accessories ) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.accessories = accessories;
    }

    public Optional<String> getName() {
        return ofNullable(name);
    }

    public String getType() {
        return type;
    }


    public int getAge() {
        return age;
    }

    public List<String> getAccessories() {
        return accessories != null ? accessories : Collections.emptyList();
    }
}
