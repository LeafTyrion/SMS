package respository;

import dataBase.DataBase;
import entity.StudentCourse;

public class StudentCourseRepository {

    public void addStudentCourse(StudentCourse studentCourse) {
        DataBase.getStudentCourseList().add(studentCourse);
    }

    public void allStudentCourse() {
        System.out.println("学号\t\t姓名\t\t课程号\t\t课程名\t\t分数");
        for (StudentCourse studentCourse : DataBase.getStudentCourseList()) {
            System.out.println(studentCourse.getStudent().getId() + "\t\t" + studentCourse.getStudent().getName() + "\t\t" + studentCourse.getCourse().getId() + "\t\t" + studentCourse.getCourse().getName() + "\t\t" + studentCourse.getScore());
        }
    }

    public StudentCourse findStudentCourseById(String sId, String cId) {
        System.out.println("学号\t\t姓名\t\t课程号\t\t课程名\t\t分数");
        for (StudentCourse studentCourse : DataBase.getStudentCourseList()) {

            if (studentCourse.getStudent().getId().equals(sId) && studentCourse.getCourse().getId().equals(cId)) {
                System.out.println(studentCourse.getStudent().getId() + "\t\t" + studentCourse.getStudent().getName() + "\t\t" + studentCourse.getCourse().getId() + "\t\t" + studentCourse.getCourse().getName() + "\t\t" + studentCourse.getScore());
                return studentCourse;
            }
        }
        return null;
    }

    public void findStudentCourseBysId(String sId) {
        System.out.println("学号\t\t姓名\t\t课程号\t\t课程名\t\t分数");
        for (StudentCourse studentCourse : DataBase.getStudentCourseList()) {

            if (studentCourse.getStudent().getId().equals(sId)) {
                System.out.println(studentCourse.getStudent().getId() + "\t\t" + studentCourse.getStudent().getName() + "\t\t" + studentCourse.getCourse().getId() + "\t\t" + studentCourse.getCourse().getName() + "\t\t" + studentCourse.getScore());
            }
        }
    }

    public void findStudentCourseBycId(String cId) {
        System.out.println("学号\t\t姓名\t\t课程号\t\t课程名\t\t分数");
        for (StudentCourse studentCourse : DataBase.getStudentCourseList()) {

            if (studentCourse.getCourse().getId().equals(cId)) {
                System.out.println(studentCourse.getStudent().getId() + "\t\t" + studentCourse.getStudent().getName() + "\t\t" + studentCourse.getCourse().getId() + "\t\t" + studentCourse.getCourse().getName() + "\t" + studentCourse.getScore());
            }
        }
    }

    public void deleteStudentCourseById(String sId, String cId) {
        DataBase.getStudentCourseList().removeIf(studentCourse -> studentCourse.getStudent().getId().equals(sId) && studentCourse.getCourse().getId().equals(cId));
    }
}
