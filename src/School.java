import java.util.Arrays;
import java.util.Scanner;

public class School {
    private String name;
    private Student[] students;

    public School() {
    }

    public void getAIIStudent(Student[] students) {
        System.out.println(Arrays.toString(students));
    }

    public void getBYName(String name, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                System.out.println(students[i]);

            }
        }

    }

    public void getAIIBoys(Student[] studens) {
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].getGender().equals("Male")) {
                System.out.println(studens[i]);
            }
        }
    }


//    @Override
//    public String toString() {
//        return "School{" +
//                "name='" + name + '\'' +
//                "students='" + students + '\'' +
//                ", students=" + Arrays.toString(students) +
//                '}';
//    }
}


