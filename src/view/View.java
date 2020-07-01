package view;

import java.util.Scanner;

public class View {
    private static Scanner in = new Scanner(System.in);

    public static void welcome() {
        System.out.println("欢迎使用学生信息管理系统！");
        System.out.println("1. 管理学生信息");
        System.out.println("2. 管理课程信息");
        System.out.println("3. 管理学生选课信息");
        System.out.println("0. 退出系统");
        System.out.println("请输入操作序号：");
    }

    public static void student() {
        System.out.println("1. 查询学生信息");
        System.out.println("2. 新增学生信息");
        System.out.println("3. 修改学生信息");
        System.out.println("4. 删除学生信息");
        System.out.println("0. 返回上一级菜单");
        System.out.println("请输入操作序号：");
    }

    public static void studentSearch() {
        System.out.println("1. 查询所有学生信息");
        System.out.println("2. 按专业查询学生信息");
        System.out.println("3. 按学号查询学生信息");
        System.out.println("0. 返回上一级菜单");
        System.out.println("请输入操作序号：");
    }

    public static void course() {
        System.out.println("1. 查询课程信息");
        System.out.println("2. 新增课程信息");
        System.out.println("3. 修改课程信息");
        System.out.println("4. 删除课程信息");
        System.out.println("0. 返回上一级菜单");
        System.out.println("请输入操作序号：");
    }

    public static void courseSearch() {
        System.out.println("1. 查询所有课程信息");
        System.out.println("2. 按课程名查询课程信息");
        System.out.println("3. 按课程号查询课程信息");
        System.out.println("0. 返回上一级菜单");
        System.out.println("请输入操作序号：");
    }




    public static void studentCourse() {
        System.out.println(" ");
        System.out.println("1. 查询学生选课信息");
        System.out.println("2. 新增学生选课信息");
        System.out.println("3. 修改学生选课信息");
        System.out.println("4. 删除学生选课信息");
        System.out.println("0. 返回上一级菜单");
        System.out.println("请输入操作序号：");
    }
    public static void studentCourseSearch() {
        System.out.println("1. 查询所有学生选课信息");
        System.out.println("2. 按学号查询学生选课信息");
        System.out.println("3. 按课程号查询学生选课信息");
        System.out.println("0. 返回上一级菜单");
        System.out.println("请输入操作序号：");
    }


    public static void exception() {
        System.out.println("输入错误！请输入正确内容!");
    }

    public static void bye() {
        System.out.println("谢谢您的使用，再见！");
    }
}
