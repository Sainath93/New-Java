package Day16;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

class Student
{
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double gpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
public class Condition {
    public static void main(String[] args) {
        List<Student> names = new ArrayList<>(Arrays.asList(new Student("Sai","Nath",3.88),
                new Student("Tyson","M",3.4),
                new Student("Sachin","P",4)));
        double average = names.stream().mapToDouble(Student::gpa).average().orElse(0.0);
        names = names.stream().filter(s->s.gpa>average).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
