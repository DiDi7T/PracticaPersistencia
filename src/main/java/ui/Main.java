package ui;

import control.PersonController;

import java.io.File;
import java.util.Arrays;

public class Main {
    private PersonController controller;
    public Main(){
        controller = new PersonController();
    }
    public static void main(String[] args){
       Main main = new Main();
       main.controller.createPerson("name",18,"12341");
        main.controller.createPerson("name2",17,"12347");
        main.controller.createPerson("name",18,"12341");
        System.out.println(main.controller.getPeople());
        main.controller.save();
        main.controller.clearList();
        System.out.println(main.controller.getPeople());
        main.controller.load();
        System.out.println(main.controller.getPeople());
        System.out.println(main.controller.getPeople().get(0).getAge());

        /**
        File projectDir =new File(System.getProperty("user.dir"));
        System.out.println("variable project" + projectDir);
        System.out.println("variable project" + projectDir.getAbsolutePath());
        System.out.println("variable project" + projectDir.getPath());
        System.out.println("variable name: " + projectDir.getName()); //Ruta relativa del proyecto
        File data = new File(projectDir+"\\src\\main\\data");
        System.out.println(data.exists());
        data.mkdir();
        System.out.println(data.exists());
         */
    }
}
