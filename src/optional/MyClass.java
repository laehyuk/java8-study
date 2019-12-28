package optional;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyClass {

    Animal dog;
    Optional<String> test;

    public static void main( String[] args ) {
        MyClass mc = new MyClass();
        mc.afterApplyOptional();
        mc.beforeApplyOptional();
    }

    public MyClass() {
    }


    public void beforeApplyOptional(){
        dog = new Animal(null,"dog",5);
        System.out.println(dog.getName());
    }

    public void afterApplyOptional(){
        dog = new Animal(null,"dog",5,null);
        System.out.println(dog.getName().isPresent());
        System.out.println(dog.getName().isEmpty());
        System.out.println(dog.getName().orElse("default value"));
        System.out.println(dog.getAccessories());
    }


}
