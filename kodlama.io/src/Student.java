public class Student extends  User{
    private String takenCourses;
    private String homework;
    private String studentNumber;

    public Student(int id, String firstName, String lastName, String email, String password,String studentNumber, String takenCourses, String homework) {
        super(id,firstName,lastName,email,password);
        this.takenCourses = takenCourses;
        this.homework = homework;
    }

    public String getTakenCourses() {
        return takenCourses;
    }

    public Student setTakenCourses(String takenCourses) {
        this.takenCourses = takenCourses;
        return this;
    }

    public String getHomework() {
        return homework;
    }

    public Student setHomework(String homework) {
        this.homework = homework;
        return this;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public Student setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
        return this;
    }
}
