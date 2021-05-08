public class Instructor extends User{
    private String course;
    private String about;

    public Instructor(int id, String firstName, String lastName, String email, String password,String course, String about) {
        super(id,firstName,lastName,email,password);
        this.course = course;
        this.about = about;
    }

    public String getCourse() {
        return course;
    }

    public Instructor setCourse(String course) {
        this.course = course;
        return this;
    }

    public String getAbout() {
        return about;
    }

    public Instructor setAbout(String about) {
        this.about = about;
        return this;
    }

}
