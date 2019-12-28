package generic;

public class GenericTest {

    // 제네릭 범위를 InterfaceName을 상속 또는 구현하는 클래스로 제한
    public static <T extends InterfaceName> void printSubject(final T param) {
        param.printSub();
    }

    // 제네릭 범위를 Human을 상속 또는 구현하는 클래스로 제한
    public static <T extends Human>void printName(final T param) {
        param.printName();
    }


    public static void printSubject(final Introduce<? extends Human> param) {
        Human tmp = param.ReturnOBJ();
        tmp.printName();
    }

    public static void main( String[] args ) {
        Student student =new Student("내용","주제");

        Introduce<Student> introduce1 = new Introduce<>(new Student("학생임"));
        Introduce<Human> introduce2 = new Introduce<>(new Human("사람임"));

        printName(student);
        printSubject(student);

        printSubject(introduce1);
        printSubject(introduce2);

    }
}
