package entity;

public class Course {

    private String id;
    private String name;
    private float credit;
    private int studentNum;

    public Course() {
    }

    public Course(String id, String name, float credit, int studentNum) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.studentNum = studentNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
