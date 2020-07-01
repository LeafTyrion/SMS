package entity;

public class Student {

    private String id;
    private String name;
    private String speciality;
    private String className;

    public Student() {
    }

    public Student(String id, String name, String speciality, String className) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.className = className;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
