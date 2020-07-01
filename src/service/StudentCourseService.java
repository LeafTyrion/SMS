package service;

import entity.Course;
import entity.Student;
import entity.StudentCourse;
import respository.CourseRepository;
import respository.StudentCourseRepository;
import respository.StudentRepository;
import view.View;

import java.util.Scanner;

public class StudentCourseService {


    private static final Scanner in = new Scanner(System.in);

    StudentCourseRepository studentCourseRepository = new StudentCourseRepository();
    CourseRepository courseRepository = new CourseRepository();
    StudentRepository studentRepository = new StudentRepository();


    public void studentCourseAdd() {

        StudentCourse studentCourse = new StudentCourse();
        System.out.println("请输入学号：");
        String sId = in.next();
        Student student = studentRepository.findStudentById(sId);
        System.out.println("请输入课程号：");
        String cId = in.next();
        Course course = courseRepository.findCourseById(cId);
        System.out.println("请输入分数：");
        studentCourse.setScore(in.nextFloat());
        int stuNum = course.getStudentNum();
        course.setStudentNum(++stuNum);
        studentCourse.setStudent(student);
        studentCourse.setCourse(course);
        studentCourseRepository.addStudentCourse(studentCourse);
        System.out.println("添加成功！");


    }


    public void studentCourseSearch() {
        View.studentCourseSearch();

        int option = in.nextInt();


        switch (option) {
            case 1:
                studentCourseRepository.allStudentCourse();
                studentCourseSearch();
                break;
            case 2:
                System.out.println("请输入学号：");
                String sId = in.next();
                studentCourseRepository.findStudentCourseBysId(sId);
                studentCourseSearch();
                break;
            case 3:
                System.out.println("请输入课程号：");
                String cId = in.next();
                studentCourseRepository.findStudentCourseBycId(cId);
                studentCourseSearch();
                break;
            case 0:
                break;
            default:
                View.exception();
                studentCourseSearch();
        }
    }

    public void studentCourseUpdate() {

        System.out.println("请输入学号：");
        String sId = in.next();
        System.out.println("请输入课程号：");
        String cId = in.next();
        StudentCourse studentCourse = studentCourseRepository.findStudentCourseById(sId, cId);
        if (studentCourse != null) {

            System.out.println("请输入新学号：");
            String newsId = in.next();
            System.out.println("请输入新课程号：");
            String newcId = in.next();

            Student student = studentRepository.findStudentById(newsId);
            Course course = courseRepository.findCourseById(newcId);
            studentCourse.setStudent(student);
            studentCourse.setCourse(course);
            System.out.println("请输入课程分数：");
            float score = in.nextFloat();
            studentCourse.setScore(score);
            System.out.println("修改成功！");
        }


    }

    public void studentCourseDelete() {
        System.out.println("请输入要删除的学号：");
        String sId = in.next();
        System.out.println("请输入要删除的课程号：");
        String cId = in.next();
        studentCourseRepository.deleteStudentCourseById(sId, cId);
        System.out.println("删除成功！");
    }
}
