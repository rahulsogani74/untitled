package random;

public class TestNull {

    public static void main(String[] args) {
        TestNull aNull = new TestExtendNull();
        aNull.display("null");
    }

    public void display(String xyz) {
        System.out.println("string");
    }

    public void display(Object xyz) {
        System.out.println("object");
    }
}

class TestExtendNull extends TestNull {

    @Override
    public void display(Object xyz) {
        System.out.println("object from child");
    }

}
