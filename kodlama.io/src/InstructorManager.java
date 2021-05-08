public class InstructorManager {
    public void comment(Instructor instructor, Student student){
        System.out.println(instructor.getFirstName()+ " "+instructor.getLastName()+ " commented to " +student.getFirstName());
    }
    public void courseAdding(Instructor instructor) {
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" added "+instructor.getCourse());
    }
}
