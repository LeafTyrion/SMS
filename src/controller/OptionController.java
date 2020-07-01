package controller;

import service.StudentCourseService;
import view.View;

import java.util.Scanner;

public class OptionController {


    private static final Scanner in = new Scanner(System.in);
    private final StudentController studentController = new StudentController();
    private final CourseController courseController = new CourseController();
    private final StudentCourseController studentCourseController=new StudentCourseController();


    public void index() {

        while (true) {
            View.welcome();

            int option = in.nextInt();
            if (option == 0) {
                View.bye();
                break;
            }

            switch (option) {
                case 1:
                    studentController.student();
                    break;
                case 2:
                    courseController.course();
                    break;
                case 3:
                    studentCourseController.studentCourse();
                    break;

                default:
                    View.exception();
                    index();
            }
        }


    }


}
