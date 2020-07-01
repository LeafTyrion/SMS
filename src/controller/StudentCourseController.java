package controller;

import service.StudentCourseService;
import view.View;

import java.util.Scanner;

public class StudentCourseController {

    private static final Scanner in = new Scanner(System.in);

    private final StudentCourseService studentCourseService = new StudentCourseService();

    public void studentCourse() {
        View.studentCourse();
        int option = in.nextInt();

        switch (option) {
            case 1:
                studentCourseService.studentCourseSearch();
                studentCourse();
                break;
            case 2:
                studentCourseService.studentCourseAdd();
                studentCourse();
                break;
            case 3:
                studentCourseService.studentCourseUpdate();
                studentCourse();
                break;
            case 4:
                studentCourseService.studentCourseDelete();
                studentCourse();
                break;
            case 0:
                break;
            default:
                View.exception();
                studentCourse();
        }


    }
}
