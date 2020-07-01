package controller;

import service.StudentService;
import view.View;

import java.util.Scanner;

public class StudentController {

    private static final Scanner in = new Scanner(System.in);

    private final StudentService studentService = new StudentService();

    public void student() {
        View.student();
        int option = in.nextInt();

        switch (option) {
            case 1:
                studentService.studentSearch();
                student();
                break;
            case 2:
                studentService.studentAdd();
                student();
                break;
            case 3:
                studentService.studentUpdate();
                student();
                break;
            case 4:
                studentService.studentDelete();
                student();
                break;
            case 0:
                break;
            default:
                View.exception();
                student();
        }


    }


}
