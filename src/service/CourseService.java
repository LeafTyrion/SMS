package service;

import entity.Course;
import respository.CourseRepository;
import view.View;

import java.util.Scanner;

public class CourseService {

    private static final Scanner in = new Scanner(System.in);

    CourseRepository courseRepository = new CourseRepository();


    public void courseAdd() {

        Course course = new Course();
        System.out.println("请输入课程号：");
        course.setId(in.next());
        System.out.println("请输入课程名：");
        course.setName(in.next());
        System.out.println("请输入学分：");
        course.setCredit(in.nextFloat());
        courseRepository.addCourse(course);
        System.out.println("添加成功！");


    }


    public void courseSearch() {
        View.courseSearch();

        int option = in.nextInt();


        switch (option) {
            case 1:
                courseRepository.allCourse();
                courseSearch();
                break;
            case 2:
                System.out.println("请输入课程名：");
                String name = in.next();
                courseRepository.findCourseByName(name);
                courseSearch();
                break;
            case 3:
                System.out.println("请输入课程号：");
                String id = in.next();
                courseRepository.findCourseById(id);
                courseSearch();
                break;
            case 0:
                break;
            default:
                View.exception();
                courseSearch();
        }
    }

    public void courseUpdate() {

        System.out.println("请输入要修改的课程号：");
        String id = in.next();
        Course course = courseRepository.findCourseById(id);
        if (course != null) {
            System.out.println("请输入课程名：");
            String name = in.next();
            course.setName(name);
            System.out.println("请输入课程学分：");
            float credit = in.nextFloat();
            course.setCredit(credit);
            System.out.println("修改成功！");
        }


    }

    public void courseDelete() {
        System.out.println("请输入要删除的课程号：");
        String id = in.next();
        courseRepository.deleteCourseById(id);
        System.out.println("删除成功！");
    }
}
