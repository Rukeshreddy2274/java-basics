public class Student implements Comparable<Student>{
    
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + name + " rollNo: " + rollNo + " marks: " + marks;
    }

    @Override
    public int compareTo(Student o) {
        
        int marksCompare = Integer.compare(this.marks, o.marks);

        if(marksCompare == 0) {
            return Integer.compare(this.rollNo, o.rollNo);
        }
        return marksCompare;
    }
}
