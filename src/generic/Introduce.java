package generic;

class Introduce<T> {
    private T obj;
    Introduce (final T obj) {
        this.obj = obj;
    }
    public T ReturnOBJ() {
        return obj;
    }
}
//
//public class GenericTest {
//
//    public static void printSubject(final Introduce<?extends Human> param) {
//        Human tmp = param.ReturnOBJ();
//        tmp.printName();
//    }
//    public static void main(String[] args) {
//        Introduce<Student> introduce1 =new Introduce<>(new Student("시리순"));
//        Introduce<Human> introduce2 =new Introduce<>(new Human("꼬끼오"));
//
//        printSubject(introduce1);
//        printSubject(introduce2);
//    }
//}

