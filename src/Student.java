public class Student {

    private int age;
    private String lastName;
    private  String name;
    private String gender;


    public Student(int age, String lastName, String name, String gender) {

        this.age = age;
        this.lastName = lastName;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}' + '\n';
    }
}





