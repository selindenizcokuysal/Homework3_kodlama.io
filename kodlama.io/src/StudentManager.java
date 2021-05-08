public class StudentManager {
    public void takenCourses(Instructor instructor, Student student){
        System.out.println(student.getFirstName()+" "+student.getLastName()+ ", took courses from "+instructor.getFirstName()+" "+instructor.getLastName());
    }
    public void homework(Student student){
        System.out.println(student.getHomework()+" successfully completed by "+student.getId());
    }

}
