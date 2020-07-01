package controller;

import service.CourseService;
import view.View;

import java.util.Scanner;

public class CourseController {


    private static final Scanner in = new Scanner(System.in);

    private final CourseService courseService = new CourseService();

    public void course() {
        View.course();
        int option = in.nextInt();

        switch (option) {
            case 1:
                courseService.courseSearch();
                course();
                break;
            case 2:
                courseService.courseAdd();
                course();
                break;
            case 3:
                courseService.courseUpdate();
                course();
                break;
            case 4:
                courseService.courseDelete();
                course();
                break;
            case 0:
                break;
            default:
                View.exception();
                course();
        }


    }

}
