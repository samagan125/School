
public class Main {
    public static void main(String[] args) {
Student student= new Student(15,"Tolonbaev","Samagan","Male");
Student student1= new Student(16,"Tolonbaev","Kumarbek","Male");
Student student3 = new Student(17,"Tolonbaeva","Dilnaz","Female");
Student student2 = new Student(15,"Asanov","Baikal","Male");
Student[] students = {student,student1,student2,student3};
School school = new School();
//school.getAIIStudent(students);
//school.getBYName("Dilnaz",students);
school.getAIIBoys(students);





    }

    }
