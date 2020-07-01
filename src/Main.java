import controller.OptionController;
import dataBase.VirData;

public class Main {

    public static void main(String[] args) {

        VirData.setCourse();
        VirData.setStudent();
        VirData.setStudentCourse();


        OptionController optionController = new OptionController();
        optionController.index();

    }
}
