package generic;

public class Student extends Human implements InterfaceName {

    private String subject;

    Student( String subject ) {
        super(null);
        this.subject = subject;
    }

    Student ( final String name, final String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void printSub() {
        System.out.println("subject : " + subject);
    }

}
