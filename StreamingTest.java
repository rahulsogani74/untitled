import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamingTest {

    public static void main(String ...args) {
        List<Student> students = new ArrayList<>();
        Optional<String> maxElement = students.stream()
                .map(stud -> stud.getfName() + " " + stud.getlName())
                .max((o1, o2) -> o1.compareTo(o2));

        System.out.println(maxElement.isPresent() ? maxElement.get() : null);

    }

}

class Student {

    private String fName;
    private String lName;
    private int age;
    private int salary;

    public Student(String fName, String lName, int age, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
