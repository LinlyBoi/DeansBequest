package Student;

public class Course {
    private String title;
    private int Students;
    private final int maxStudents = 10;
    Student[] students = new Student[10];
    int count = 0;

    public String Register(Student student) {
        if (count < 10) {
            students[count] = student;
            count++;
            return "Success";
        } else {
            return "Course full!";
        }

    }
       public boolean isFull()
        {
            if(count ==9)
                return true;
            else
                return false;
        }

        public int NumberofStudents()
        {
            if(students[0].getName().isBlank())
                return 0;
            else
            return count;

        }
        public String title()
        {
            return title;
        }

}
