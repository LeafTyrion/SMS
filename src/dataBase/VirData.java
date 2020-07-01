package dataBase;

import entity.Course;
import entity.Student;
import entity.StudentCourse;

import java.util.List;

public class VirData {

    static Student student = new Student("123", "张三", "软件工程", "1班");
    static Course course = new Course("321", "Java", 2.5f, 1);
    static StudentCourse studentCourse = new StudentCourse(course, student, 59);

    public static void setStudent() {
        DataBase.getStudentList().add(student);
    }

    public static void setCourse() {
        DataBase.getCourseList().add(course);
    }

    public static void setStudentCourse() {
        DataBase.getStudentCourseList().add(studentCourse);
    }

}
