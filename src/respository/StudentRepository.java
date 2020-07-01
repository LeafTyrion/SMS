package respository;

import dataBase.DataBase;
import entity.Student;

public class StudentRepository {

    public void addStudent(Student student) {
        DataBase.getStudentList().add(student);
    }

    public void allStudent() {
        System.out.println("学号\t\t姓名\t\t专业\t\t班级");
        for (Student student : DataBase.getStudentList()) {
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getSpeciality() + "\t\t" + student.getClassName());
        }
    }

    public void findStudentBySpeciality(String speciality) {
        System.out.println("学号\t\t姓名\t\t专业\t\t班级");
        for (Student student : DataBase.getStudentList()) {
            if (student.getSpeciality().equals(speciality)) {
                System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getSpeciality() + "\t\t" + student.getClassName());
            }
        }
    }

    public Student findStudentById(String id) {
        System.out.println("学号\t\t姓名\t\t专业\t\t班级");
        for (Student student : DataBase.getStudentList()) {

            if (student.getId().equals(id)) {
                System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getSpeciality() + "\t\t" + student.getClassName());
                return student;
            }
        }
        return null;
    }

    public void deleteStudentById(String id) {
        DataBase.getStudentList().removeIf(student -> student.getId().equals(id));
    }

}
