import java.util.ArrayList;
import java.util.Collections;

class StudentSortingDemo {

    public static void main(String[] args) {
        
        var students = new ArrayList<Student>();
        students.add(new Student("Rukesh", 27, 127));
        students.add(new Student("Hanuman", 26, 125));
        students.add(new Student("Ram", 25, 119));

        System.out.println(students);

        Collections.sort(students);
    }
}
