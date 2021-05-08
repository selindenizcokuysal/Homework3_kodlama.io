public class Main {

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Student user1 = new Student(1,"deniz","cokuysal","@","1234","123","Java","Java OOP");
        Student user2 = new Student(2,"mehmet can","tulun","@","1234","123","Java","Java OOP");
        Student user3 = new Student(3,"karanfil","kayıkcı","@","1234","123","Java","Java OOP");

        InstructorManager instructorManager = new InstructorManager();
        Instructor instructor = new Instructor(4,"engin","demirog","@","123","Java, Python","instructor");

        studentManager.homework(user1);
        studentManager.takenCourses(instructor,user2);

        instructorManager.comment(instructor,user3);
        instructorManager.courseAdding(instructor);

        UserManager userManager = new UserManager();
        User[] users ={user1,user2,user3,instructor};
        userManager.addMultiple(users);
    }

}
