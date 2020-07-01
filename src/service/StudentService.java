package service;

import entity.Student;
import respository.StudentRepository;
import view.View;

import java.util.Scanner;

public class StudentService {

    private static final Scanner in = new Scanner(System.in);

    StudentRepository studentRepository = new StudentRepository();


    public void studentAdd() {

        Student student = new Student();
        System.out.println("请输入学号：");
        student.setId(in.next());
        System.out.println("请输入学生姓名：");
        student.setName(in.next());
        System.out.println("请输入专业：");
        student.setSpeciality(in.next());
        System.out.println("请输入班级：");
        student.setClassName(in.next());
        studentRepository.addStudent(student);
        System.out.println("添加成功！");


    }


    public void studentSearch() {
        View.studentSearch();

        int option = in.nextInt();


        switch (option) {
            case 1:
                studentRepository.allStudent();
                studentSearch();
                break;
            case 2:
                System.out.println("请输入专业名称：");
                String speciality = in.next();
                studentRepository.findStudentBySpeciality(speciality);
                studentSearch();
                break;
            case 3:
                System.out.println("请输入学号：");
                String id = in.next();
                studentRepository.findStudentById(id);
                studentSearch();
                break;
            case 0:
                break;
            default:
                View.exception();
                studentSearch();
        }
    }

    public void studentUpdate() {

        System.out.println("请输入要修改的学生学号：");
        String id = in.next();
        Student student = studentRepository.findStudentById(id);
        if (student != null) {
            System.out.println("请输入学生姓名：");
            String name = in.next();
            student.setName(name);
            System.out.println("请输入学生专业：");
            String speciality = in.next();
            student.setSpeciality(speciality);
            System.out.println("请输入学生班级：");
            String className = in.next();
            student.setClassName(className);
            System.out.println("修改成功！");
        }


    }

    public void studentDelete() {
        System.out.println("请输入要删除的学生学号：");
        String id = in.next();
        studentRepository.deleteStudentById(id);
        System.out.println("删除成功！");
    }

}
