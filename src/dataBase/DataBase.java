package dataBase;

import entity.Course;
import entity.Student;
import entity.StudentCourse;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<Student> studentList=new ArrayList<>();
    private static List<Course> courseList=new ArrayList<>();
    private static List<StudentCourse> studentCourseList=new ArrayList<>();

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        DataBase.studentList = studentList;
    }

    public static List<Course> getCourseList() {
        return courseList;
    }

    public static void setCourseList(List<Course> courseList) {
        DataBase.courseList = courseList;
    }

    public static List<StudentCourse> getStudentCourseList() {
        return studentCourseList;
    }

    public static void setStudentCourseList(List<StudentCourse> studentCourseList) {
        DataBase.studentCourseList = studentCourseList;
    }
}
