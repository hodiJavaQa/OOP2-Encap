public class Course {
    private String name;
    public int numberOfStudents;
    public String subject;

    public Course(String name, int numberOfStudents, String subject) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.subject = subject;
    }

    void brakee(){
        System.out.println("take a 45 min break");
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", subject='" + subject + '\'' +
                '}';
    }
}
