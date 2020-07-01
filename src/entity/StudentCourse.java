package entity;

public class StudentCourse {

    private Course course;
    private Student student;
    private float score;

    public StudentCourse() {
    }

    public StudentCourse(Course course, Student student, float score) {
        this.course = course;
        this.student = student;
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
