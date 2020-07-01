package respository;

import dataBase.DataBase;
import entity.Course;

public class CourseRepository {

    public void addCourse(Course course) {
        DataBase.getCourseList().add(course);
    }

    public void allCourse() {
        System.out.println("课程号\t\t课程名\t\t学分\t\t选课人数");
        for (Course course : DataBase.getCourseList()) {
            System.out.println(course.getId() + "\t\t" + course.getName() + "\t\t" + course.getCredit() + "\t\t" + course.getStudentNum());
        }
    }

    public void findCourseByName(String name) {
        System.out.println("课程号\t\t课程名\t\t学分\t\t选课人数");
        for (Course course : DataBase.getCourseList()) {

            if (course.getName().equals(name)) {
                System.out.println(course.getId() + "\t\t" + course.getName() + "\t\t" + course.getCredit() + "\t\t" + course.getStudentNum());
            }
        }
    }

    public Course findCourseById(String id) {
        System.out.println("课程号\t\t课程名\t\t学分\t\t选课人数");
        for (Course course : DataBase.getCourseList()) {

            if (course.getId().equals(id)) {
                System.out.println(course.getId() + "\t\t" + course.getName() + "\t\t" + course.getCredit() + "\t\t" + course.getStudentNum());
                return course;
            }
        }
        return null;
    }

    public void deleteCourseById(String id) {
        DataBase.getCourseList().removeIf(course -> course.getId().equals(id));
    }
}
